package com.kurumi.top100.utils;

import com.kurumi.top100.entity.ListNode;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午9:12:34
 * @Description
 */
public class ListNodeUtils {
    // 反转链表
    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode cur = head, pre = null, next;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    // 计算链表长度
    public static int getLength(ListNode head) {
        if (head == null) return 0;
        int len = 0;
        while (head != null) {
            ++len;
            head = head.next;
        }
        return len;
    }

    // 合并两有序链表
    public static ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1), cur = dummy;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                cur.next = head1;
                head1 = head1.next;
            } else {
                cur.next = head2;
                head2 = head2.next;
            }
            cur = cur.next;
        }
        cur.next = head1 != null ? head1 : head2;
        return dummy.next;
    }
}
