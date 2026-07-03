package com.kurumi.codeThoughts.链表.链表相交;

import com.kurumi.codeThoughts.链表.ListNode;

/**
 * @Author kurumi
 * @Date 2026-07-01 下午10:59:43
 * @Description 面试题 02.07. 链表相交
 */
public class LeetCode_review_02_07 {
    static class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int lenA = 0, lenB = 0, gap = 0;
            ListNode tmpA = headA, tmpB = headB;
            ListNode maxNode, minNode;
            while (tmpA != null) {
                lenA++;
                tmpA = tmpA.next;
            }
            while (tmpB != null) {
                lenB++;
                tmpB = tmpB.next;
            }
            if (lenA > lenB) {
                gap = lenA - lenB;
                maxNode = headA;
                minNode = headB;
            } else {
                gap = lenB - lenA;
                maxNode = headB;
                minNode = headA;
            }
            while (gap-- > 0)
                maxNode = maxNode.next;
            while (maxNode != null) {
                if (maxNode == minNode)
                    return maxNode;
                maxNode = maxNode.next;
                minNode = minNode.next;
            }
            return null;
        }
    }
}
