package com.company.LC0027;

public class LC0027_V1 {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int len = nums.length, point1 = 0, point2 = len-1;
        if (len == 1 & nums[0]==val) return 0;
        while (point1<point2){
            while (nums[point1] != val) {
                point1++;
                if (point1 == len) return len;
            }
            while (nums[point2] == val) {
                point2--;
                len--;
                if (len == 0) return len;
            }
            if (point1<point2){
                int mid = nums[point1];
                nums[point1] = nums[point2];
                nums[point2] = mid;
                len--;
                point2--;
                point1++;

            }
        }
        if (point1 == point2){
            while (nums[point2] == val){
                point2--;
                len--;
            }
        }
        return len;

    }

    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        int[] nums = new int[]{3,2};
        int val = 2;

        LC0027_V1 T = new LC0027_V1();
        System.out.println(T.removeElement(nums,val));
    }
}
