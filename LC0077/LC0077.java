package com.company.LC0077;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC0077 {
    public List<List<Integer>> combine(int n, int k) {
        return combineS(1, n, k);
    }
    public List<List<Integer>> combineS(int str, int n, int k) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for (int i = str;i <= n-k+1 ;i++){
            if (k>1){
                List<List<Integer>> subans = combineS(i+1, n, k-1);
                for (List<Integer> tmpList : subans){
                    List<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(i);
                    tmp.addAll(tmpList);
                    ans.add(tmp);
                }
            }
            else{
                List<Integer> tmp = new ArrayList<Integer>();
                tmp.add(i);
                ans.add(tmp);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LC0077 T = new LC0077();
        int n = 4, k = 3;
        System.out.println(Arrays.toString(T.combine(n,k).toArray()));
    }
}
