package com.company.LC0347;

import java.util.*;

public class LC0347_V1 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> kTop = new HashMap<Integer,Integer>();
        for (int i : nums){
            if (kTop.containsKey(i)) kTop.put(i,kTop.get(i)+1);
            else kTop.put(i,1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(kTop.entrySet());
        //list.sort()
        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }
        return ans;
    }
    public static void main(String[] args){
        LC0347_V1 T = new LC0347_V1();
        int[] nums = new int[]{9};
        int k = 1;
        System.out.println(Arrays.toString(T.topKFrequent(nums,k)));
    }
}
