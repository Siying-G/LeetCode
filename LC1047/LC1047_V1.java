package com.company.LC1047;

public class LC1047_V1 {
    public String removeDuplicates(String s) {
        System.out.println(s);
        StringBuilder str = new StringBuilder(s);
        int flag = 0;
        for (int i = 1;i < str.length(); i++){
            if (str.charAt(i) == str.charAt(i-1)){
                flag = 1;
                str.deleteCharAt(i);
                str.deleteCharAt(i-1);
            }
        }
        return (flag == 0) ? str.toString() : removeDuplicates(str.toString());
    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        LC1047_V1 T = new LC1047_V1();
        String s = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        System.out.println(T.removeDuplicates(s));
    }
}
