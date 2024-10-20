// 141. 环形链表
package com.kurumi.leetCode.哈希;

import com.kurumi.leetCode.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: kurumi
 * @date: 2024-10-17 0:03:58
 */
public class LeetCode_0141 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        // 若添加到集合失败则说明遍历过该节点, 有环
        while (head != null) {
            if (!set.add(head)) return true;
            head = head.next;
        }
        return false;
    }
}
