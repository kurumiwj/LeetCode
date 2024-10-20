// 160. 相交链表
package com.kurumi.leetCode.双指针;

import com.kurumi.leetCode.ListNode;

/**
 * @author: kurumi
 * @date: 2024-10-18 0:25:20
 */
public class LeetCode_0160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode p1 = headA, p2 = headB;
        while (p1 != p2) {
            p1 = p1 == null ? headB : p1.next;
            p2 = p2 == null ? headA : p2.next;
        }
        return p1;
    }
}
