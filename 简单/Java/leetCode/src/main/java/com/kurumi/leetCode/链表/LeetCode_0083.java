package com.kurumi.leetCode.链表;

import com.kurumi.leetCode.entity.ListNode;

/**
 * @Author kurumi
 * @Date 2026-07-04 下午4:25:15
 * @Description 83. 删除排序链表中的重复元素
 */
public class LeetCode_0083 {
    static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode cur = head;
            while (cur != null && cur.next != null) {
                while (cur.next != null && cur.next.val == cur.val) cur.next = cur.next.next;
                cur = cur.next;
            }
            return head;
        }
    }
}
