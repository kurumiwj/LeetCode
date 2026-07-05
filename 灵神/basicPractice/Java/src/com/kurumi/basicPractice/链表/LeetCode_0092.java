package com.kurumi.basicPractice.链表;

import com.kurumi.basicPractice.entity.ListNode;

/**
 * @Author kurumi
 * @Date 2026-07-04 下午2:34:29
 * @Description 92. 反转链表 II
 */
public class LeetCode_0092 {
    static class Solution {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            ListNode dummy = new ListNode(-1, head), start = dummy;
            for (int i = 0; i < left - 1; i++) start = start.next;
            ListNode pre = null, cur = start.next;
            for (int i = left; i <= right; i++) {
                ListNode next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            start.next.next = cur;
            start.next = pre;
            return dummy.next;
        }
    }
}
