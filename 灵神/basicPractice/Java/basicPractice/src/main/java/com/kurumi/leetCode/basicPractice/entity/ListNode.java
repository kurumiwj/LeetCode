package com.kurumi.leetCode.basicPractice.entity;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午6:04:22
 * @Description ListNode
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
