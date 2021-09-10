package com.company.LC1930;

import java.util.HashMap;
import java.util.Map;

public class LC1930_V1 {
    public int countPalindromicSubsequence(String s) {
        Map<String, Integer> seen = new HashMap();
        int sum = 0;
        if (s.length() == 3 & (s.charAt(0) != s.charAt(2))) return 0;
        for (int i=0;i<s.length()-2;i++){
            if (i>=1){
                if (s.charAt(i)==s.charAt(i-1)){
                    continue;
                }
            }
            int end = s.lastIndexOf(s.charAt(i));
            for (int j = i+1; j<end; j++){
                String midStr = Character.toString(s.charAt(i)) + s.charAt(j) + s.charAt(end);
                if (!seen.containsKey(midStr)){
                    System.out.println(midStr);
                    seen.put(midStr, sum);
                    sum++;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        // write your code here
        String s = "bbcbaba";
        LC1930_V1 T = new LC1930_V1();
        System.out.println(T.countPalindromicSubsequence(s));
    }
}
