package com.company.LC1764;

public class LC1764_V3 {
    public boolean canChoose(int[][] groups, int[] nums) {
        String ss="";
        for(int i=0;i<nums.length;i++)ss+=nums[i];
        int q=0;
        for(int [] res : groups){
            String str="";
            for(int i=0;i<res.length;i++)str=str+res[i];
            q=ss.indexOf(str,q);
            if(q==-1)return false;
            q=q+str.length();
        }
        return true;
    }

    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        int[][] groups = new int[][] {{-27},{-40}};
        int[] nums = new int[] {10,18,41,-13,25,48,-40,40,-34,-13,17,43,32,-28,28,-19,-47,45,3,42,-2,33, 28,-9,-11,-16,3,34,-30,-6,32,23,24,-14,-14,1,40,-43,-34,40,23,9,14,14,-31, 50,-18,-23,-19,-21,38,24,-41,-28,47,-8,17,-34,-45,-24,7,-5,7,-23,-42,-4,31, 48,40,15,-27,-39,50,-40,38,-18,26,17,49,-18,28,9,3,42,5,-43,9,-36,15,38, -15,-33,-21,4,-11,24,-15};
        LC1764_V3 T = new LC1764_V3();
        System.out.println(T.canChoose(groups,nums));
    }
}
