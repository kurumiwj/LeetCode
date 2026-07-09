package com.kurumi.leetCode.basicPractice.链表;

import com.kurumi.leetCode.basicPractice.entity.ListNode;

/**
 * @Author kurumi
 * @Date 2026-07-04 下午4:18:30
 * @Description 19. 删除链表的倒数第 N 个结点
 */
public class LeetCode_0019 {
    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(-1, head), right = dummy, left = dummy;
            while (n-- > 0) right = right.next;
            while (right.next != null) {
                left = left.next;
                right = right.next;
            }
            left.next = left.next.next;
            return dummy.next;
        }
    }
}
