package com.company.LC0454;

import java.util.HashMap;
import java.util.Map;

public class LC0454_V1 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int len = nums1.length, ans = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (!map.containsKey(nums1[i]+nums2[j])) map.put(nums1[i]+nums2[j], 1);
                else map.put(nums1[i]+nums2[j], map.get(nums1[i]+nums2[j])+1);
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (map.containsKey(-nums3[i]-nums4[j])) ans += map.get(-nums3[i]-nums4[j]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        int[] nums1 = new int[]{-1,-1}, nums2 = new int[]{-1,1}, nums3 = new int[]{-1,1}, nums4 = new int[]{1,-1};

        LC0454_V1 T = new LC0454_V1();
        System.out.println(T.fourSumCount(nums1, nums2, nums3, nums4));
    }
}
