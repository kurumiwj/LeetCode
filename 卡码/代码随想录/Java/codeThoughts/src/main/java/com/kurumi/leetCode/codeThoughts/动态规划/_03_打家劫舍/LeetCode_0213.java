package com.kurumi.leetCode.codeThoughts.动态规划._03_打家劫舍;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 213. 打家劫舍 II
 */
public class LeetCode_0213 {
    static class Solution {
        public int rob0(int[] nums, int start, int end) {
            if (end - start == 1)
                return nums[start];
            int[] dp = new int[nums.length];
            dp[start] = nums[start];
            if (end - start > 1) {
                dp[start + 1] = Math.max(nums[start], nums[start + 1]);
            }
            for (int i = start + 2; i < end; i++) {
                dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            }
            return dp[end - 1];
        }

        public int rob(int[] nums) {
            if (nums.length == 1)
                return nums[0];
            return Math.max(rob0(nums, 0, nums.length - 1), rob0(nums, 1, nums.length));
        }
    }
}
