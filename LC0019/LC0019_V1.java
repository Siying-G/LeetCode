package com.company.LC0019;

public class LC0019_V1 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode prev = dummyNode;
        //双指针
        ListNode str = prev,end = prev;
        while (n-->0) end = end.next;
        while (end.next != null){
            str = str.next;
            end = end.next;
        }
        str.next = str.next.next;//删除节点

//        dummyNode = dummyNode.next;
//        while (dummyNode != null){
//            System.out.println(dummyNode.val);
//            dummyNode = dummyNode.next;
//        }
        return dummyNode.next;
    }
    public static void main(String[] args) {
    // write your code heres = "abaac", cost = [1,2,3,4,5]
    ListNode n1 = new ListNode(1);
//    ListNode n2 = new ListNode(2);
//    ListNode n3 = new ListNode(3);
//    ListNode n4 = new ListNode(4);
//    ListNode n5 = new ListNode(5);
//    n1.next = n2;
//    n2.next = n3;
//    n3.next = n4;
//    n4.next = n5;

    int n = 1;
    LC0019_V1 T = new LC0019_V1();
    System.out.println(T.removeNthFromEnd(n1,n));
}
}
