package com.company.LC1047;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LC1047_V2 {
    public String removeDuplicates(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (Character ch : s.toCharArray()){
            if (stack.isEmpty() || ch != stack.peek()) stack.push(ch);
            else if (ch == stack.peek()) stack.pop();
        }
        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty()) str.append(stack.pop());
        return str.reverse().toString();
    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        LC1047_V2 T = new LC1047_V2();
        String s = "abbaca";
        System.out.println(T.removeDuplicates(s));
    }
}
