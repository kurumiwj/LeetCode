package com.kurumi.leetCode.codeThoughts.动态规划._02_背包问题._01_01背包;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 494. 目标和
 */
public class LeetCode_0494 {
    static class Solution {
        public int findTargetSumWays(int[] nums, int target) {
            int sum = 0;
            for (int num : nums)
                sum += num;
            if (Math.abs(target) > sum || (target + sum) % 2 == 1)
                return 0;
            int n = (target + sum) / 2;
            int[] dp = new int[n + 1];
            dp[0] = 1;
            for (int i = 0; i < nums.length; i++) {
                for (int j = n; j >= nums[i]; j--) {
                    dp[j] += dp[j - nums[i]];
                }
            }
            return dp[n];
        }
    }
}
