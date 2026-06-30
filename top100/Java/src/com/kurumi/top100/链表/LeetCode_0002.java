package com.kurumi.top100.链表;

import com.kurumi.top100.entity.ListNode;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午6:06:27
 * @Description 2. 两数相加
 */
public class LeetCode_0002 {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head1 = l1, head2 = l2, root = new ListNode(-1), cur = root;
            int carry = 0;
            while (head1 != null || head2 != null || carry != 0) {
                int val1 = head1 == null ? 0 : head1.val;
                int val2 = head2 == null ? 0 : head2.val;
                int tmp = val1 + val2 + carry;
                cur.next = new ListNode(tmp % 10);
                cur = cur.next;
                carry = tmp / 10;
                if (head1 != null)
                    head1 = head1.next;
                if (head2 != null)
                    head2 = head2.next;
            }
            return root.next;
        }
    }
}
