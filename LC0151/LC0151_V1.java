package com.company.LC0151;

public class LC0151_V1 {
    public String reverseWords(String s) {
        StringBuffer str = new StringBuffer();
        int index = s.length()-1;
        for ( ; index >= 0 ; index--){//去除字符串末尾的空格
            if (s.charAt(index) != ' ') break;
        }
        int strInd = index+1;
        for (int i = index ; i >= 0 ; i--){//去除字符串末尾的空格
            if (s.charAt(i) == ' ' && s.charAt(i+1) == ' ') {
                strInd = i;
                continue;
            }
            if (s.charAt(i) == ' ') {
                str.append(s.substring(i+1,strInd));
                str.append(' ');
                strInd = i;
            }
//            else strInd = i;
        }
        if (s.charAt(0) != ' ') str.append(s.substring(0,strInd));
        else str.delete(str.length()-1,str.length());
        return str.toString();
    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        String s = "  Bob    Loves  Alice   ";

        LC0151_V1 T = new LC0151_V1();
        System.out.println(T.reverseWords(s));
    }
}
