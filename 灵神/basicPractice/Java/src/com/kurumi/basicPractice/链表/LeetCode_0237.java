package com.kurumi.basicPractice.链表;

import com.kurumi.basicPractice.entity.ListNode;

/**
 * @Author kurumi
 * @Date 2026-07-04 下午4:16:48
 * @Description 237. 删除链表中的节点
 */
public class LeetCode_0237 {
    static class Solution {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
