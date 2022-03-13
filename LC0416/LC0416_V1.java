package com.company.LC0416;

//二维背包
public class LC0416_V1 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        if (sum%2 != 0) return false;
        sum /= 2;

        int[][] dp = new int[nums.length][sum+1];
        for (int j = nums[0]; j < sum+1; j++) {
            dp[0][j] = nums[0];
        }
        for (int i = 1; i < nums.length; i++){
            for (int j = 1; j < sum+1; j++){
                if(j >= nums[i]){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-nums[i]]+nums[i]);
                }
                else dp[i][j] = dp[i-1][j];
            }
        }
        return dp[nums.length-1][sum] == sum;
    }
    public static void main(String[] args) {
        LC0416_V1 T = new LC0416_V1();
        int[] nums = new int[]{1,5,11,5};
        System.out.println(T.canPartition(nums));
    }
}