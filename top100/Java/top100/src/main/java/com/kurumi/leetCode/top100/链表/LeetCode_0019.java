package com.kurumi.leetCode.top100.链表;

import com.kurumi.leetCode.top100.entity.ListNode;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午9:47:32
 * @Description 19. 删除链表的倒数第 N 个结点
 */
public class LeetCode_0019 {
    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            int index = 0;
            ListNode fast = head, slow = head;
            while (index < n) {
                fast = fast.next;
                ++index;
            }
            if (fast == null) {
                return head.next;
            }
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return head;
        }
    }
}
