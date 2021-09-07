package com.company;

public class LC0058_V1 {
    public int lengthOfLastWord(String s) {
        int len = s.length(),sum = 0;
        while ((s.charAt(len-1) -' ') == 0) len--;//不读字符串末尾的空格
        while ((s.charAt(len-1) -' ') != 0) {
//            System.out.println(s.charAt(len-1));
            sum++;
            len--;
            if (len == 0) break;//单个字母的情况
        }
//        System.out.println(s.charAt(len-6)-' ');
        return sum;
    }

    public static void main(String[] args) {
        // write your code here
        String s = "a";//new String();
        LC0058_V1 T = new LC0058_V1();
        System.out.println(T.lengthOfLastWord(s));
    }
}
