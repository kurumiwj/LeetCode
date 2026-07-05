package com.kurumi.basicPractice.链表;

import com.kurumi.basicPractice.entity.ListNode;
import com.kurumi.basicPractice.utils.ListNodeUtils;

/**
 * @Author kurumi
 * @Date 2026-07-04 下午3:55:42
 * @Description 143. 重排链表
 */
public class LeetCode_0143 {
    static class Solution {
        public void reorderList(ListNode head) {
            ListNode fast = head, slow = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode head1 = ListNodeUtils.reverse(slow);
            while (head1.next != null) {
                ListNode next = head.next, next1 = head1.next;
                head.next = head1;
                head1.next = next;
                head = next;
                head1 = next1;
            }
        }
    }
}
