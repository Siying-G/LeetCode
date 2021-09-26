package com.company.LC0237;

public class LC0237_V1 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        LC0237_V1 T = new LC0237_V1();
        T.deleteNode(node2);
//        System.out.println(T.deleteNode(node1));
    }
}
