package com.kurumi.codeThoughts.链表.删除链表倒数第n个节点;

import com.kurumi.codeThoughts.链表.ListNode;

/**
 * @Author kurumi
 * @Date 2026-07-01 下午10:59:43
 * @Description 19. 删除链表的倒数第 N 个结点
 */
public class LeetCode_0019 {
    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(-1, head);
            ListNode fast = dummy, slow = dummy;
            n++;
            while (n-- > 0) {
                fast = fast.next;
            }
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return dummy.next;
        }
    }
}