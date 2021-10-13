package com.company.LC0027;

public class LC0027_V2 {
    public int removeElement(int[] nums, int val) {

        int i=0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=val) {
                nums[i++]=nums[j];
            }
        }
        return i;

    }

    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        int[] nums = new int[]{3,2};
        int val = 2;

        LC0027_V1 T = new LC0027_V1();
        System.out.println(T.removeElement(nums,val));
    }
}
