package com.company.LC0225;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> queue0;
    private Queue<Integer> queue1;
    int size;

    public MyStack() {
        queue0 = new LinkedList<Integer>();
        queue1 = new LinkedList<Integer>();
        size = 0;
    }

    public void push(int x) {
        queue0.offer(x);
        size += 1;
    }

    public int pop() {
        int indicator = size;
        size -= 1;
        for (Integer i : queue0){
            indicator --;
            if (indicator == 0) {
                indicator = i;
                break;
            }
        }
        if (size == 0) queue0 = new LinkedList<Integer>();
        return indicator;
    }

    public int top() {
        int indicator = size;
        for (Integer i : queue0){
            indicator --;
            if (indicator == 0) {
                indicator = i;
                break;
            }
        }
        return indicator;
    }

    public boolean empty() {
        return (size > 0) ? false : true;
    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        MyStack myStack = new MyStack();
        myStack.push(1);
        System.out.println(myStack.pop()); // 返回 2
        myStack.push(2);
        System.out.println(myStack.top()); // 返回 2
//        System.out.println(myStack.pop()); // 返回 1
//        System.out.println(myStack.empty()); // 返回 False
    }
}