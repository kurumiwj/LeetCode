package com.kurumi.leetCode.codeThoughts.链表.移除链表元素;

import com.kurumi.leetCode.codeThoughts.链表.ListNode;

/**
 * @Author kurumi
 * @Date 2026-07-01 下午10:59:43
 * @Description 203. 移除链表元素
 */
public class LeetCode_0203 {
    static class Solution {
        public ListNode removeElements(ListNode head, int val) {
            while (head != null && head.val == val) { // 找到第一个不等于val的头结点
                head = head.next;
            }
            ListNode current = head;
            while (current != null && current.next != null) {
                if (current.next.val == val) {
                    current.next = current.next.next;
                } else
                    current = current.next;
            }
            return head;
        }
    }
}
