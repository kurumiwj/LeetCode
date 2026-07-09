package com.kurumi.leetCode.top100.链表;

import com.kurumi.leetCode.top100.entity.ListNode;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午9:34:32
 * @Description 142. 环形链表 II
 */
public class LeetCode_0142 {
    static public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode fast = head, slow = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) {
                    slow = head;
                    while (slow != fast) {
                        slow = slow.next;
                        fast = fast.next;
                    }
                    return fast;
                }
            }
            return null;
        }
    }
}
