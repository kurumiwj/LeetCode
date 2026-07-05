package com.kurumi.basicPractice.链表;

import com.kurumi.basicPractice.entity.ListNode;

/**
 * @Author kurumi
 * @Date 2026-07-04 下午3:43:57
 * @Description 876. 链表的中间结点
 */
public class LeetCode_0876 {
    static class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }
}
