package com.kurumi.leetCode.easy.双指针;

import com.kurumi.leetCode.easy.entity.ListNode;

/**
 * @Author Administrator
 * @Date 2026年6月10日 22:25:13
 * @Description 876. 链表的中间结点
 */
public class LeetCode_0876 {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
