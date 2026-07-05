package com.kurumi.leetCode.链表;

import com.kurumi.leetCode.entity.ListNode;

/**
 * @Author kurumi
 * @Date 2026-07-04 下午2:31:58
 * @Description 206. 反转链表
 */
public class LeetCode_0206 {
    static class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null)
                return head;
            ListNode preHead = reverseList(head.next);
            ListNode tail = head.next;
            tail.next = head;
            head.next = null;
            return preHead;
        }
    }
}
