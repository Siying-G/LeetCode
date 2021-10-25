package com.company.LC0024;

public class LC0024_V2 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    //递归
    public ListNode swapPairs(ListNode head) {
        // base case 退出提交
        if(head == null || head.next == null) return head;
        // 获取当前节点的下一个节点
        ListNode next = head.next;
        // 进行递归
        ListNode newNode = swapPairs(next.next);
        // 这里进行交换
        next.next = head;
        head.next = newNode;

        return next;
    }

    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        ListNode n1 = new ListNode(1);
//        LC0024.ListNode n2 = new LC0024.ListNode(2);
//        LC0024.ListNode n3 = new LC0024.ListNode(3);
//        LC0024.ListNode n4 = new LC0024.ListNode(4);
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;

        LC0024_V2 T = new LC0024_V2();
        System.out.println(T.swapPairs(n1));
    }
}
