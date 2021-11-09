package com.company.LC0020;


import java.util.Stack;

public class LC0020 {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        for (Character ch : s.toCharArray()){
            if (ch == '(' || ch == '[' || ch == '{') brackets.push(ch);
            else {
                if (brackets.empty()) return false;
                else if (ch == ')' && brackets.peek() == '(') brackets.pop();
                else if (ch == ']' && brackets.peek() == '[') brackets.pop();
                else if (ch == '}' && brackets.peek() == '{') brackets.pop();
                else return false;
            }
        }
        return brackets.empty();
    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        LC0020 T = new LC0020();
        String s = "";
        System.out.println(T.isValid(s));
    }
}
