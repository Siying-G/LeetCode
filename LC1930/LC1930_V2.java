package com.company.LC1930;

import java.util.HashMap;
import java.util.Map;

public class LC1930_V2 {
    public int countPalindromicSubsequence(String s) {
        Map<String, Integer> seen = new HashMap();
        int sum = 0;
        if (s.length() == 3 & (s.charAt(0) != s.charAt(2))) return 0;
        for (int i=0;i<26;i++){
            char nowChr = (char)(i+97);
            int start = s.indexOf(nowChr);
            int end = s.lastIndexOf(nowChr);
            for (int j = start+1; j<end; j++){
                String midStr = Character.toString(nowChr) + s.charAt(j) + nowChr;
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
        LC1930_V2 T = new LC1930_V2();
        System.out.println(T.countPalindromicSubsequence(s));
    }
}
