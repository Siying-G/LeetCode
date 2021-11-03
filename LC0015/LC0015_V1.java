package com.company.LC0015;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC0015_V1 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
//        nums = shellSort(nums);
        Arrays.sort(nums);
        for (int i = 0; i< nums.length; i++){//在i之后找两个数与nums[i]相加为0
            if (i>0 && nums[i]==nums[i-1]) continue;
            if (nums[i] > 0) break;

            int start = i+1, end = nums.length-1;
            while (start < end){
                List<Integer> temp = new ArrayList<>();
                int sum = nums[i] + nums[start] +nums[end];
                if (sum == 0){//找到符合的三元组
                    temp.add(nums[start]);
                    temp.add(nums[end]);
                    temp.add(nums[i]);
                    ans.add(temp);
                    while(start < end && nums[start] == nums[start + 1]){
                        start++;
                    }
                    while(start < end && nums[end] == nums[end - 1]){
                        end --;
                    }
                    start++;
                    end--;
                }
                else if (sum < 0) start++;
                else end--;
            }
        }
        return ans;
    }
    public static int[] shellSort(int[] ins){

        int n = ins.length;
        int gap = n/2;
        while(gap > 0){
            for(int j = gap; j < n; j++){
                int i=j;
                while(i >= gap && ins[i-gap] > ins[i]){
                    int temp = ins[i-gap]+ins[i];
                    ins[i-gap] = temp-ins[i-gap];
                    ins[i] = temp-ins[i-gap];
                    i -= gap;
                }
            }
            gap = gap/2;
        }
        return ins;
    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        int[] nums = new int[]{0,0,0,0};

        LC0015_V1 T = new LC0015_V1();
        System.out.println(T.threeSum(nums));
    }
}
