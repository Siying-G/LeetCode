package com.company.LC0707;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class MyLinkedList {
    int size;
    ListNode head;

    public MyLinkedList() {
        size = 0;
    }

    public int get(int index) {
        if (size<=0 || index<0 || index>=size) return -1;
        ListNode header = head;
        while (index-->0) header = header.next;
        return header.val;
    }

    public void addAtHead(int val) {
        ListNode header = new ListNode(val);
        header.next = head;
        head = header;
        size ++;
    }

    public void addAtTail(int val) {
        if (size == 0){
            addAtHead(val);
            return;
        }
        ListNode header = head;
        while (header.next!=null) header = header.next;
        ListNode tail = new ListNode(val);
        header.next = tail;
        size ++;
    }

    public void addAtIndex(int index, int val) {
        if (index<=0) {
            addAtHead(val);
            return;
        }
        else if (index == size){
            addAtTail(val);
            return;
        }
        else if (index > size) return;
        ListNode header = head;
        while (index-->1) header = header.next;
        ListNode insert = new ListNode(val);
        insert.next = header.next;
        header.next = insert;
        size ++;
    }

    public void deleteAtIndex(int index) {
        if (index<0 || index>=size) return;
        if (index == 0) {
            head = head.next;
            size --;
            return;
        }
        ListNode header = head;
        while (index-->1) header = header.next;
        header.next = header.next.next;
        size --;

    }
    public static void main(String[] args) {
        // write your code heres = "abaac", cost = [1,2,3,4,5]

        MyLinkedList T = new MyLinkedList();
        T.addAtHead(1);
        T.addAtTail(3);
        T.addAtIndex(1,2);
        T.deleteAtIndex(1);
        T.deleteAtIndex(3);
        T.deleteAtIndex(0);
        T.deleteAtIndex(0);
//        T.addAtHead(3);
//        T.addAtTail(2);
//        T.addAtTail(555);
//        T.addAtIndex(1,333);
//        T.deleteAtIndex(5);

        ListNode headT = T.head;

        while (headT != null){
            System.out.println(headT.val);
            headT = headT.next;
        }
        System.out.println(T.get(0));
    }
}
//["","get","deleteAtIndex","get"]
//        [,,[0],[0],[0]]