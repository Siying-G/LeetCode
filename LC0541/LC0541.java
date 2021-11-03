package com.company.LC0541;


public class LC0541 {
    public String reverseStr(String s, int k) {
        StringBuffer sreB = new StringBuffer(s.length());
        int sta = 0, end = 0 , len = s.length();
        while (sta<s.length()){
            end = (end+k > len)? len : end+k;
            for (int i = end-1; i >= sta; i--) sreB.append(s.charAt(i));

            end = (end+k > len)? len : end+k;
            for (int i = sta + k; i < end; i++) sreB.append(s.charAt(i));
            sta = end;
        }

        return sreB.toString();
    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        String s = "a";
        int k = 2;

        LC0541 T = new LC0541();
        System.out.println(T.reverseStr(s,k));
    }
}
