package com.company.LC0018;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC0018_V1 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i< nums.length; i++){
            if (i>0 && nums[i]==nums[i-1]) continue;
            for (int j = i+1; j< nums.length; j++){
                if (j>i+1 && nums[j]==nums[j-1]) continue;
                int start = j+1, end = nums.length-1;
                while (start < end){
                    List<Integer> temp = new ArrayList<>();
                    int sum = nums[i] + nums[j] + nums[start] +nums[end];
                    if (sum == target){//找到符合的三元组
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[start]);
                        temp.add(nums[end]);
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
                    else if (sum < target) start++;
                    else end--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        int[] nums = new int[]{2,2,2,2,2};
        int target = 8;

        LC0018_V1 T = new LC0018_V1();
        System.out.println(T.fourSum(nums, target));
    }
}
