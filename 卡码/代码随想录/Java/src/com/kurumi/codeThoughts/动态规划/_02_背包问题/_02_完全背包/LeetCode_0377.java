package com.kurumi.codeThoughts.动态规划._02_背包问题._02_完全背包;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 377. 组合总和 Ⅳ
 */
public class LeetCode_0377 {
    static class Solution {
        public int combinationSum4(int[] nums, int target) {
            int[] dp = new int[target + 1];
            dp[0] = 1;
            for (int i = 0; i <= target; i++) {
                for (int num : nums) {
                    if (i >= num)
                        dp[i] += dp[i - num];
                }
            }
            return dp[target];
        }
    }
}
