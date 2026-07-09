package com.kurumi.leetCode.codeThoughts.动态规划._03_打家劫舍;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 198. 打家劫舍
 */
public class LeetCode_0198 {
    static class Solution {
        public int rob(int[] nums) {
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            if (nums.length > 1)
                dp[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < nums.length; i++) {
                dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            }
            return dp[nums.length - 1];
        }
    }
}
