package com.kurumi.leetCode.链表;

import com.kurumi.leetCode.entity.ListNode;

/**
 * @Author kurumi
 * @Date 2026-07-04 下午3:16:34
 * @Description 25. K 个一组翻转链表
 */
public class LeetCode_0025 {
    static class Solution {
        private int getLength(ListNode head) {
            ListNode cur = head;
            int len = 0;
            while (cur != null) {
                ++len;
                cur = cur.next;
            }
            return len;
        }

        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode dummy = new ListNode(-1, head), pre = null, cur = head, start = dummy;
            int len = getLength(head);
            while (len >= k) {
                len -= k;
                for (int i = 0; i < k; i++) {
                    ListNode next = cur.next;
                    cur.next = pre;
                    pre = cur;
                    cur = next;
                }
                start.next.next = cur;
                ListNode tmp = start.next;
                start.next = pre;
                start = tmp;
            }
            return dummy.next;
        }
    }
}
