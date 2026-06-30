package com.kurumi.top100.双指针;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午5:48:24
 * @Description 283. 移动零
 */
public class LeetCode_0283 {
    static class Solution {
        public void moveZeroes(int[] nums) {
            int n = nums.length, start = 0, end = 0;
            if (n <= 1)
                return;
            while (end < n) {
                if (nums[end] != 0) {
                    int tmp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = tmp;
                    start++;
                }
                end++;
            }
        }
    }
}
