package com.kurumi.leetCode;

/**
 * @author: kurumi
 * @date: 2024-10-19 14:39:18
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int x) {
        val = x;
        next = null;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
