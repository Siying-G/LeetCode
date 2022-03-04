package com.company.LC0347;

import java.util.*;

public class LC0347_V2 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> kTop = new HashMap<Integer,Integer>();
        for (int i : nums){
            kTop.put(i,kTop.getOrDefault(i,0)+1);
        }

        Set<Map.Entry<Integer,Integer>> entries = kTop.entrySet();
        //构建优先队列，即小顶堆
        PriorityQueue<Map.Entry<Integer,Integer>> priQ = new PriorityQueue<>((o1,o2)->o1.getValue()-o2.getValue());
        for (Map.Entry<Integer,Integer> entri : entries){
            priQ.offer(entri);
            if (priQ.size()>k) priQ.poll();
        }

        //输出
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = priQ.poll().getKey();
        }
        return ans;
    }

    public static void main(String[] args){
        LC0347_V2 T = new LC0347_V2();
        int[] nums = new int[]{1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(T.topKFrequent(nums,k)));
    }
}
