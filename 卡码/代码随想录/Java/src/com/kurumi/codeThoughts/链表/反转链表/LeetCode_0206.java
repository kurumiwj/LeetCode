package com.kurumi.codeThoughts.链表.反转链表;

import com.kurumi.codeThoughts.链表.ListNode;

/**
 * @Author kurumi
 * @Date 2026-07-01 下午10:59:43
 * @Description 206. 反转链表
 */
public class LeetCode_0206 {
    static class Solution {
        // 递归
        public ListNode reverseList(ListNode head) {
            // 链表为空或者只有一个节点
            if (head == null || head.next == null)
                return head;
            ListNode node = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return node;
        }

        // 双指针法
        public ListNode reverseList1(ListNode head) {
            // 链表为空或者只有一个节点
            if (head == null || head.next == null)
                return head;
            ListNode pre = null;
            ListNode cur = head;
            while (cur != null) {
                ListNode tmp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = tmp;
            }
            return pre;
        }
    }
}
