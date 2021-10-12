package com.company.LC0704;

public class LC0704_V1 {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length, mid;
        while (low<high){
            mid = (high+low)>>1;
            if (nums[mid]<target) low = mid+1;
            else if (nums[mid]>target) high = mid;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 2;

        LC0704_V1 T = new LC0704_V1();
        System.out.println(T.search(nums,target));
    }
}
