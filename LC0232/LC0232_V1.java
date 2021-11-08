package com.company.LC0232;


import java.util.Stack;

class MyQueue_V1 {
    private Stack<Integer> normal;
    private Stack<Integer> reverse;
    int size = 0;
    public MyQueue_V1() {
        size = 0;
        normal = new Stack<Integer>();
        reverse = new Stack<Integer>();
    }

    public void push(int x) {
        normal.push(x);
        size ++;
        Stack<Integer> imm = (Stack<Integer>)normal.clone();
        int tem = size;
        reverse = new Stack<Integer>();
        while (tem > 0){
            reverse.push(imm.pop());
            tem --;
        }
    }

    public int pop() {
        size --;
        int ans = reverse.pop();

        return ans;
    }

    public int peek() {
        return reverse.peek();
    }

    public boolean empty() {
        return (size > 0) ? false : true;
    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        MyQueue_V1 obj = new MyQueue_V1();
//        obj.push(1 );
//        obj.push(2 );
//        int param_2 = obj.peek();
//        int param_3 = obj.pop();
        boolean param_4 = obj.empty();
    }
}