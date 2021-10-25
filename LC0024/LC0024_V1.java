package com.company.LC0024;


public class LC0024_V1 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        ListNode header = new ListNode(-1,head);
        ListNode virHead = header;
        while (virHead.next != null && virHead.next.next != null){
            ListNode midNode = virHead.next;
            ListNode nextNode = virHead.next.next;
            ListNode newNode = virHead.next.next.next;
            virHead.next = nextNode;
            nextNode.next = midNode;
            midNode.next = newNode;
            virHead = virHead.next.next;
        }
        while (header != null){
            System.out.println(header.val);
            header = header.next;
        }
        return head;
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

        LC0024_V1 T = new LC0024_V1();
        System.out.println(T.swapPairs(n1));
    }
}
