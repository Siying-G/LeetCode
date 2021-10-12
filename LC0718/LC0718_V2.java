package com.company.LC0718;

public class LC0718_V2 {
    public int findLength(int[] A, int[] B) {
        if (A.length == 0 || B.length == 0) {
            return 0;
        }
        int[][] dp = new int[A.length+1][B.length+1];
        int result = 0;
        for (int i = 1; i <= A.length; i++) {
            for (int j = 1; j <= B.length; j++) {
                if (A[i-1] == B[j-1]) {
                    dp[i][j] = dp[i-1][j-1]+1;
                    result = Math.max(result, dp[i][j]);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        int[] A = new int[]{1,2,3,2,1}, B = new int[]{3,2,1,4,7};

        LC0718_V2 T = new LC0718_V2();
        System.out.println(T.findLength(A,B));
    }
}
