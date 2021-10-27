package com.company.LC0142;

import com.company.LC0019.LC0019_V1;

public class LC0142_V1 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode dummyHead = new ListNode(-1000000);
        dummyHead.next = head;
        ListNode prev = dummyHead.next;
        if (prev == null || prev.next == null || prev.next.next == null) return null;
        ListNode quick = prev.next.next, slow = prev.next;
        int q = 2, s = 1;
        while (quick != slow){
            if (quick.next == null || quick.next.next == null || slow.next == null) return null;
            quick = quick.next.next;//快指针走两部
            slow = slow.next;//慢指针走一步
            q += 2;
            s += 1;
        }
        //知道环的长度后，再让快指针从头走，慢指针从原地开始走，每次前进一步
        quick = dummyHead.next;
        while (quick != slow){
            quick = quick.next;//快指针走两部
            slow = slow.next;//慢指针走一步
        }
        return quick;

    }

    public static void main(String[] args) {
      // write your code heres = "abaac", cost = [1,2,3,4,5]
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);
        ListNode n5 = new ListNode(2);
        ListNode n6 = new ListNode(3);
        ListNode n7 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        LC0142_V1 T = new LC0142_V1();
        System.out.println(T.detectCycle(n1));
    }
}
