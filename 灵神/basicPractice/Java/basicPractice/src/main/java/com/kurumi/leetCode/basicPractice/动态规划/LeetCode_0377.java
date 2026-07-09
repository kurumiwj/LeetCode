package com.kurumi.leetCode.basicPractice.动态规划;

/**
 * @Author kurumi
 * @Date 2026-07-09 下午1:17:37
 * @Description 377. 组合总和 Ⅳ
 */
public class LeetCode_0377 {
    static class Solution {
        public int combinationSum4(int[] nums, int target) {
            int[] dp = new int[target + 1];
            dp[0] = 1;
            for (int i = 1; i <= target; i++) {
                for (int num : nums) {
                    if (num <= i) dp[i] += dp[i - num];
                }
            }
            return dp[target];
        }
    }
}
