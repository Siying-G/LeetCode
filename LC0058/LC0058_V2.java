package com.company;

public class LC0058_V2 {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length != 0) {//末尾有空格时，不加length，判断了末尾空格，同时中间空格时直接输出
                return length;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        // write your code here
        String s = "a";//new String();
        LC0058_V2 T = new LC0058_V2();
        System.out.println(T.lengthOfLastWord(s));
    }
}
