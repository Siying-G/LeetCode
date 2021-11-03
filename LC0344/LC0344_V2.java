package com.company.LC0344;

public class LC0344_V2 {
    public void reverseString(char[] s) {
        int start = 0, end = s.length-1;
        while (start < end){
            s[start] ^= s[end];//构造 a ^ b 的结果，并放在 a 中
            s[end] ^= s[start];//将 a ^ b 这一结果再 ^ b ，存入b中，此时 b = a, a = a ^ b
            s[start] ^= s[end];//a ^ b 的结果再 ^ a ，存入 a 中，此时 b = a, a = b 完成交换
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        char[] s = new char[]{'H','a','n','n','e','h'};

        LC0344_V2 T = new LC0344_V2();
        T.reverseString(s);
//        System.out.println(T.reverseString(s));
    }
}
