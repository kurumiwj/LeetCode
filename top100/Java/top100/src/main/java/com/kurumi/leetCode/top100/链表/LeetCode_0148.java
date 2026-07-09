package com.kurumi.leetCode.top100.链表;

import com.kurumi.leetCode.top100.entity.ListNode;
import com.kurumi.leetCode.top100.utils.ListNodeUtils;

/**
 * @Author kurumi
 * @Date 2026-07-01 上午11:12:20
 * @Description 148. 排序链表
 */
public class LeetCode_0148 {
    static class Solution {
        public ListNode sortList(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode head2 = middleNode(head);
            return ListNodeUtils.merge(sortList(head), sortList(head2));
        }

        private ListNode middleNode(ListNode head) {
            ListNode fast = head, slow = head, pre = head;
            while (fast != null && fast.next != null) {
                pre = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            pre.next = null;
            return slow;
        }
    }
}
