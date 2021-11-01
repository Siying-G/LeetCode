package com.company.LC0001;


import java.util.HashMap;
import java.util.Map;

public class LC0001 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>(nums.length);
        int[] ans = new int[2];
        for (int i = 0;i < nums.length;i++){
            if (map.containsKey(target-nums[i])){
                ans[0] = i;
                ans[1] = map.get(target-nums[i]);
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        int[] nums = new int[]{3,3};
        int n = 6;

        LC0001 T = new LC0001();
        System.out.println(T.twoSum(nums, n));
    }
}
