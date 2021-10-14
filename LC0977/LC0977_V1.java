package com.company.LC0977;

import java.util.Arrays;
//暴力解法
public class LC0977_V1 {
    public int[] sortedSquares(int[] nums) {
        for (int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        return Sort(nums);
    }    //希尔排序
    public int[] Sort(int[] position) {
        int len = position.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = position[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && position[preIndex] > temp) {
                    position[preIndex + gap] = position[preIndex];
                    preIndex -= gap;
                }
                position[preIndex + gap] = temp;
            }
            gap /= 2;
        }
        return position;
    }

    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        int[] nums = new int[]{11};
        LC0977_V1 T = new LC0977_V1();
        System.out.println(Arrays.toString(T.sortedSquares(nums)));
    }
}
