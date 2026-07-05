package com.kurumi.basicPractice.链表;

import com.kurumi.basicPractice.entity.ListNode;

/**
 * @Author kurumi
 * @Date 2026-07-04 下午3:49:35
 * @Description 142. 环形链表 II
 */
public class LeetCode_0142 {
    static class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    fast = head;
                    while (slow != fast) {
                        slow = slow.next;
                        fast = fast.next;
                    }
                    return slow;
                }
            }
            return null;
        }
    }
}
