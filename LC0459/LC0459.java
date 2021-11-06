package com.company.LC0459;

public class LC0459 {
    public boolean repeatedSubstringPattern(String s) {
        int len = 0;
        while (len++ < s.length()-1){//循环查找每个长度是否可行，最小子串长度为1，最长s.length()-1
            if (s.length() % len != 0) continue;
            if (s.charAt(0) != s.charAt(len)) continue;

            int flag = 1;
            String subString = s.substring(0,0+len);
            for (int i = len; i< s.length()-len+1; i+=len){
                String newS = s.substring(i,i+len);
                if (!newS.equals(subString)) flag = 0;
            }
            if (flag == 1) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        String s = "abav";

        LC0459 T = new LC0459();
        System.out.println(T.repeatedSubstringPattern(s));
    }
}
