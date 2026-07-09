package com.kurumi.leetCode.top100.链表;

import com.kurumi.leetCode.top100.entity.Node;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午6:07:13
 * @Description 138. 随机链表的复制
 */
public class LeetCode_0138 {
    static class Solution {
        public Node copyRandomList(Node head) {
            for (Node node = head; node != null; node = node.next.next)
                node.next = new Node(node.val, node.next);
            for (Node node = head; node != null; node = node.next.next) {
                if (node.random != null)
                    node.next.random = node.random.next;
            }
            Node dummy = new Node(-1), pre = dummy;
            for (Node cur = head; cur != null; cur = cur.next) {
                pre.next = cur.next;
                cur.next = cur.next.next;
                pre = pre.next;
            }
            return dummy.next;
        }
    }
}
