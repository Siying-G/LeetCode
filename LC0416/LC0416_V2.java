package com.company.LC0416;

//一维背包
public class LC0416_V2 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        if (sum%2 != 0) return false;
        sum /= 2;

        int[] dp = new int[sum+1];
//        for (int i = nums[0]; i < sum+1; i++) {
//            dp[i] = nums[0];
//        }
        for (int i = 0; i < nums.length; i++){
            for (int j = sum; j >= 0; j--){
                if(j >= nums[i]) dp[j] = Math.max(dp[j], dp[j-nums[i]]+nums[i]);
            }
        }
        return dp[sum] == sum;
    }
    public static void main(String[] args) {
        LC0416_V2 T = new LC0416_V2();
        int[] nums = new int[]{1,5,11,5};
        System.out.println(T.canPartition(nums));
    }
}
