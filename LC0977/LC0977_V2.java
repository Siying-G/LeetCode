package com.company.LC0977;

import java.util.Arrays;
//双指针
public class LC0977_V2 {

    public int[] sortedSquares(int[] nums) {
        int start = 0,end = nums.length-1,i = nums.length-1;
        int[] newNums = new int[nums.length];
        System.out.println(Arrays.toString(nums));
        while (start<=end){
            if (nums[start]*nums[start]<nums[end]*nums[end]){
                newNums[i] = nums[end]*nums[end];
                end--;
            }
            else {
                newNums[i] = nums[start]*nums[start];
                start++;
            }
            i--;
        }
        return newNums;
    }

    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        int[] nums = new int[]{-4,-1,0,3,10};
        LC0977_V2 T = new LC0977_V2();
        System.out.println(Arrays.toString(T.sortedSquares(nums)));
    }
}
