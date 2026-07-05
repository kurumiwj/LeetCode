package com.kurumi.basicPractice.链表;

import com.kurumi.basicPractice.entity.ListNode;

/**
 * @Author kurumi
 * @Date 2026-07-04 下午4:30:24
 * @Description 82. 删除排序链表中的重复元素 II
 */
public class LeetCode_0082 {
    static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode dummy = new ListNode(-1000, head), cur = dummy;
            while (cur.next != null && cur.next.next != null) {
                int val = cur.next.val;
                if (val != cur.next.next.val) {
                    cur = cur.next;
                    continue;
                }
                while (cur.next!= null && val == cur.next.val) cur.next = cur.next.next;
            }
            return dummy.next;
        }
    }
}
