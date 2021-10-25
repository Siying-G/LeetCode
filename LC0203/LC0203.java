package com.company.LC0203;


import java.util.Arrays;

public class LC0203 {
   public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public ListNode removeElements(ListNode head, int val) {
       while (head != null){
           if (head.val == val) head = head.next;
           else break;
       }
       if (head == null) return head;
       //判断只有一个节点的情况
       if (head.next == null){
           if (head.val != val) return head;
           else return null;
       }
       ListNode header = head;
       while (header.next != null){
           if (header.next.val == val) header.next = header.next.next;
           else header = header.next;
       }
       //判断最后一个节点
//       if(virtualHead.next.val == val) virtualHead.next = null;
       while (head != null){
           System.out.println(head.val);
           head = head.next;
       }
       return head;

    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(6);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(5);
        ListNode n7 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

//        ListNode n1 = new ListNode(1);
//        ListNode n2 = new ListNode(7);
//        n1.next = n2;
        int val = 1;
        LC0203 T = new LC0203();
        System.out.println(T.removeElements(n1,val) );
    }
}
