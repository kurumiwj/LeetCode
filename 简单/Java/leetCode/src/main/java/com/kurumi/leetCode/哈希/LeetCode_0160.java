// 160. 相交链表
package com.kurumi.leetCode.哈希;

import com.kurumi.leetCode.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: kurumi
 * @date: 2024-10-17 0:13:38
 */
public class LeetCode_0160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode ptr = headA;
        while (ptr != null) {
            set.add(ptr);
            ptr = ptr.next;
        }
        ptr = headB;
        while (ptr != null) {
            if (set.contains(ptr)) return ptr;
            ptr = ptr.next;
        }
        return null;
    }
}
