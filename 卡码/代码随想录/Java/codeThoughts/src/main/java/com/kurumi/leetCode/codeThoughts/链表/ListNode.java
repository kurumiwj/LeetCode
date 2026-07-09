package com.kurumi.leetCode.codeThoughts.链表;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:58:55
 * @Description ListNode
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
