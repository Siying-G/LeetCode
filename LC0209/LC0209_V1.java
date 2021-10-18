package com.company.LC0209;

import java.util.Arrays;

public class LC0209_V1 {
    public int minSubArrayLen(int target, int[] nums) {
        int end = 0,add = 0, minLen = 100001;

        for (int i = 0; i < nums.length; i++){
            while ((add<target) & (end<nums.length)) {//需要向后延伸时，向后延伸
                add+=nums[end];
                end ++;
            }
            if ((add>=target) & (minLen > (end-i))) minLen = end-i;//若符合条件且长度小于记录中的最小长度，则更新记录中的最小长度
            add -= nums[i];
        }
        return (minLen==100001)?0:minLen;//若minLen==100001，说明数组中没有符合条件的子数组
    }

    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        int target = 11;
        int[] nums = new int[]{1,1,1,1,1,1,1,1};
        LC0209_V1 T = new LC0209_V1();
        System.out.println(T.minSubArrayLen(target,nums));
    }
}
