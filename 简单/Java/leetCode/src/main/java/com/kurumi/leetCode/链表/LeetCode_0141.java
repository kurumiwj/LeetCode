package com.kurumi.leetCode.链表;

import com.kurumi.leetCode.entity.ListNode;

/**
 * @Author kurumi
 * @Date 2026-07-04 下午3:47:06
 * @Description 141. 环形链表
 */
public class LeetCode_0141 {
    static class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) return false;
            ListNode slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) return true;
            }
            return false;
        }
    }
}
