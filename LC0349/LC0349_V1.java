package com.company.LC0349;

import java.util.HashMap;
import java.util.Map;

public class LC0349_V1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int in : nums1){
            if (!map.containsKey(in)) map.put(in,0);
        }
        int len1 = nums1.length,len2 = nums2.length;
        int[] mid = new int[(len1>len2)?len1:len2];
        int len = 0;
        for (int in : nums2){
            if (map.containsKey(in)){
                map.remove(in);
                mid[len] = in;
                len++;
            }
        }
        int[] ans = new int[len];
        for (int i=0; i<len; i++){
            ans[i] = mid[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        int[] nums1 = new int[]{4,9,5},nums2 = new int[]{9,4,9,8,4};

        LC0349_V1 T = new LC0349_V1();
        System.out.println(T.intersection(nums1,nums2));
    }
}
