package com.kurumi.leetCode.top100.链表;

import com.kurumi.leetCode.top100.entity.ListNode;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午6:25:15
 * @Description 206. 反转链表
 */
public class LeetCode_0206 {
    static class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null) return null;
            ListNode cur = head, pre = null, next;
            while (cur != null) {
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
            }
            return pre;
        }

        public ListNode reverseList1(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode preHead = reverseList1(head.next);
            ListNode tail = head.next;
            tail.next = head;
            head.next = null;
            return preHead;
        }
    }
}
