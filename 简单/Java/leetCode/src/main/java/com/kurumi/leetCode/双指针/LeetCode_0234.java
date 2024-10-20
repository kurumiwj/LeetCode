// 234. 回文链表
package com.kurumi.leetCode.双指针;

import java.util.ArrayList;
import java.util.List;

import com.kurumi.leetCode.ListNode;

/**
 * @author: kurumi
 * @date: 2024-10-19 14:37:01
 */
public class LeetCode_0234 {
    public boolean isPalindrome(ListNode head) {
        // 只有一个节点情况
        if (head.next == null) return true;
        List<Integer> nums = new ArrayList<>();
        while (head != null) {
            nums.add(head.val);
            head = head.next;
        }
        int start = 0, end = nums.size() - 1;
        while (start < end) {
            if (nums.get(start) != nums.get(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
