package com.kurumi.top100.链表;

import com.kurumi.top100.entity.ListNode;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午11:30:08
 * @Description 24. 两两交换链表中的节点
 */
public class LeetCode_0024 {
    static class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode cur = head, dummy = new ListNode(-1, head), pre = dummy, tmp;
            while (cur != null && cur.next != null) {
                tmp = cur.next;
                pre.next = tmp;
                cur.next = tmp.next;
                tmp.next = cur;
                pre = cur;
                cur = cur.next;
            }
            return dummy.next;
        }

        public ListNode swapPairs1(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode pre = head;
            ListNode cur = pre.next;
            ListNode next = cur.next;

            pre.next = swapPairs1(next);
            cur.next = pre;
            return cur;
        }
    }
}
