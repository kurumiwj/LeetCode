package com.kurumi.leetCode.codeThoughts.链表.环形链表;

import com.kurumi.leetCode.codeThoughts.链表.ListNode;

/**
 * @Author kurumi
 * @Date 2026-07-01 下午10:59:43
 * @Description 142. 环形链表 II
 */
public class LeetCode_0142 {
    static class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode fast = head, slow = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                // 找到相交点则有环
                if (fast == slow) {
                    ListNode index1 = fast, index2 = head;
                    while (index1 != index2) {
                        index1 = index1.next;
                        index2 = index2.next;
                    }
                    return index1;
                }
            }
            return null;
        }
    }
}
