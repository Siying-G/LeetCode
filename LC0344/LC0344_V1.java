package com.company.LC0344;


public class LC0344_V1 {
    public void reverseString(char[] s) {
        int start = 0, end = s.length-1;
        while (start < end){
            char ch = s[start];
            s[start] = s[end];
            s[end] = ch;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        char[] s = new char[]{'H','a','n','n','e','h'};

        LC0344_V1 T = new LC0344_V1();
        T.reverseString(s);
//        System.out.println(T.reverseString(s));
    }
}
