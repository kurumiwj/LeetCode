package com.kurumi.leetCode.top100.链表;

import com.kurumi.leetCode.top100.entity.ListNode;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午6:05:19
 * @Description 21. 合并两个有序链表
 */
public class LeetCode_0021 {
    static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode cur1 = list1;
            ListNode cur2 = list2;
            ListNode root = new ListNode(0);
            ListNode cur = root;
            while (cur1 != null && cur2 != null){
                if (cur1.val <= cur2.val){
                    cur.next = cur1;
                    cur1 = cur1.next;
                } else {
                    cur.next = cur2;
                    cur2 = cur2.next;
                }
                cur = cur.next;
            }
            while (cur1 != null){
                cur.next = cur1;
                cur1 = cur1.next;
                cur = cur.next;
            }
            while (cur2 != null){
                cur.next = cur2;
                cur2 = cur2.next;
                cur = cur.next;
            }
            return root.next;
        }
    }
}
