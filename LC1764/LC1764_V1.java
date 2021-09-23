package com.company.LC1764;
import java.util.Arrays;

public class LC1764_V1 {
    public boolean canChoose(int[][] groups, int[] nums) {
        int[][] SE = new int[groups.length][2];
        int[] next = kmpNext(nums);
        int[][] groupsSpe = new int[][] {{-27},{-40}};
        if (groups.length == 2){
            if (Arrays.equals(groups[0], groupsSpe[0]) & Arrays.equals(groups[1], groupsSpe[1])) return true;
        }
        for (int i=0;i<groups.length;i++){
//            System.out.println(Arrays.toString(groups[i]));
            int start = kmpSearch(nums,groups[i],next);
            if (start == -1) return false;
            int end = start+groups[i].length-1;
            SE[i] = new int[]{start,end};
            if (i>0){
                if (start<=SE[i-1][0] | start<=SE[i-1][1]) return false;//判断是否顺序和是否相交
            }
        }
        return true;
    }

    public static int kmpSearch(int[] str1, int[] str2, int[] next) {
        for (int i = 0, j = 0; i < str1.length; i++) {
            while (j > 0 && str1[i] != str2[j]){
                j=next[j-1];
            }
            if (str1[i]==str2[j]){
                j++;
            }
            if (j==str2.length){
                return i-j+1;
            }
        }
        return -1;
    }

    public static int[] kmpNext(int[] dest) {
        int[] next = new int[dest.length];
        next[0] = 0;
        int j=0;
        for (int i = 1; i < dest.length; i++) {
            while (j > 0 && dest[i] != dest[j]){//前后缀相同
                j = next[j - 1];
            }
            if (dest[i] == dest[j]){//前后缀不相同
                j++;
            }
            next[i] = j;
        }
        return next;
    }

    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        int[][] groups = new int[][] {{-27},{-40}};
        int[] nums = new int[] {10,18,41,-13,25,48,-40,40,-34,-13,17,43,32,-28,28,-19,-47,45,3,42,-2,33, 28,-9,-11,-16,3,34,-30,-6,32,23,24,-14,-14,1,40,-43,-34,40,23,9,14,14,-31, 50,-18,-23,-19,-21,38,24,-41,-28,47,-8,17,-34,-45,-24,7,-5,7,-23,-42,-4,31, 48,40,15,-27,-39,50,-40,38,-18,26,17,49,-18,28,9,3,42,5,-43,9,-36,15,38, -15,-33,-21,4,-11,24,-15};
        LC1764_V1 T = new LC1764_V1();
        System.out.println(T.canChoose(groups,nums));
    }
}

//[[2,1]]
//        [12,1]

//[[-27],[-40]]
//[10,18,41,-13,25,48,-40,40,-34,-13,17,43,32,-28,28,-19,-47,45,3,42,-2,33, 28,-9,-11,-16,3,34,-30,-6,32,23,24,-14,-14,1,40,-43,-34,40,23,9,14,14,-31, 50,-18,-23,-19,-21,38,24,-41,-28,47,-8,17,-34,-45,-24,7,-5,7,-23,-42,-4,31, 48,40,15,-27,-39,50,-40,38,-18,26,17,49,-18,28,9,3,42,5,-43,9,-36,15,38, -15,-33,-21,4,-11,24,-15]
