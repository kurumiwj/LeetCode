package com.kurumi.leetCode.easy.utils;

import com.kurumi.leetCode.easy.entity.ListNode;

/**
 * @Author kurumi
 * @Date 2026-07-04 下午3:58:44
 * @Description ListNodeUtils
 */
public class ListNodeUtils {
    // 反转链表
    public static ListNode reverse(ListNode head) {
        ListNode cur = head, pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    // 找到中间节点
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
