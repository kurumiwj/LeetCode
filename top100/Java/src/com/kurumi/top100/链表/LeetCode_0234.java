package com.kurumi.top100.链表;

import java.util.ArrayList;
import java.util.List;

import com.kurumi.top100.entity.ListNode;
import com.kurumi.top100.utils.ListNodeUtils;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午9:12:58
 * @Description 234. 回文链表
 */
public class LeetCode_0234 {
    static class Solution {
        private boolean isPalindrome(List<Integer> nums) {
            int n = nums.size();
            for (int i = 0; i < n / 2; i++) {
                if (nums.get(i) != nums.get(n - 1 - i)) return false;
            }
            return true;
        }

        public boolean isPalindrome(ListNode head) {
            List<Integer> nums = new ArrayList<>();
            ListNode cur = head;
            while (cur != null) {
                nums.add(cur.val);
                cur = cur.next;
            }
            return isPalindrome(nums);
        }

        public boolean isPalindrome1(ListNode head) {
            ListNode cur = head;
            int length = 0, index = 1;
            while (cur != null) {
                cur = cur.next;
                ++length;
            }
            cur = head;
            while (index < length / 2) {
                cur = cur.next;
                ++index;
            }
            ListNode backHead = ListNodeUtils.reverseList(cur);
            cur = head;
            while (cur != null) {
                if (cur.val != backHead.val) return false;
                cur = cur.next;
                backHead = backHead.next;
            }
            return true;
        }
    }
}
