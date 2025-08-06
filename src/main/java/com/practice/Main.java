package com.practice;

public class Main {
    public static void main(String[] args) {
        ReversedLinkedList reversedLinkedList = new ReversedLinkedList();
        ReversedLinkedList.ListNode head = reversedLinkedList.new ListNode(1);
        head.next = reversedLinkedList.new ListNode(2);
        head.next.next = reversedLinkedList.new ListNode(3);
        head.next.next.next = reversedLinkedList.new ListNode(4);
        head.next.next.next.next = reversedLinkedList.new ListNode(5);
        ReversedLinkedList.ListNode result = reversedLinkedList.reverseList(head);
        System.out.println(result);
    }

}