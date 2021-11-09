package com.company.LC0150;

import java.util.ArrayDeque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LC0150 {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int ans = -300;
        for (String str : tokens){
            if (!notNumeric(str)) stack.push(Integer.parseInt(str));
            else {
                int a = stack.pop(), b = stack.pop();
                if (str.equals("+")) ans = (b + a);
                else if (str.equals("-")) ans = (b - a);
                else if (str.equals("*")) ans = (b * a);
                else if (str.equals("/")) ans = (b / a);
                stack.push(ans);
            }
        }
        return (ans == -300) ? stack.pop() : ans;
    }
    public boolean isNumeric0(String str){
        Pattern pattern = Pattern.compile("-?[0-9]+(\\\\.[0-9]+)?");
        Matcher isNum = pattern.matcher(str);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }
    public boolean notNumeric(String str){//判断是否不是数字
        if (str.length()>1) return false;
        char ch = str.charAt(0);
        return ch <'0' || ch >'9';
    }

    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        LC0150 T = new LC0150();
        String[] s = new String[]{"-10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(T.evalRPN(s));
    }
}