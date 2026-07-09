package com.kurumi.leetCode.top100.链表;

import com.kurumi.leetCode.top100.entity.ListNode;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午6:14:58
 * @Description 160. 相交链表
 */
public class LeetCode_0160 {
    static public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode curA = headA, curB = headB, longHead = null, shortHead = null;
            while (curA.next != null && curB.next != null) {
                curA = curA.next;
                curB = curB.next;
            }
            int index = 0;
            if (curA.next == null) {
                longHead = headB;
                shortHead = headA;
                while (curB.next != null) {
                    ++index;
                    curB = curB.next;
                }
            } else {
                longHead = headA;
                shortHead = headB;
                while (curA.next != null) {
                    ++index;
                    curA = curA.next;
                }
            }
            while (index-- > 0) longHead = longHead.next;
            while (shortHead != null) {
                if (longHead == shortHead) return shortHead;
                longHead = longHead.next;
                shortHead = shortHead.next;
            }
            return null;
        }
    }
}
