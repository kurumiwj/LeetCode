package com.kurumi.leetCode.codeThoughts.动态规划._02_背包问题._02_完全背包;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 518. 零钱兑换 II
 */
public class LeetCode_0518 {
    static class Solution {
        public int change(int amount, int[] coins) {
            int[] dp = new int[amount + 1];
            dp[0] = 1;
            for (int i = 0; i < coins.length; i++) {
                for (int j = coins[i]; j <= amount; j++) {
                    dp[j] += dp[j - coins[i]];
                }
            }
            return dp[amount];
        }
    }
}
