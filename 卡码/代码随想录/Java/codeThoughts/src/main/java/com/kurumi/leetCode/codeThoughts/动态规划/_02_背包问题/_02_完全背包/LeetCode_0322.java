package com.kurumi.leetCode.codeThoughts.动态规划._02_背包问题._02_完全背包;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 322. 零钱兑换
 */
public class LeetCode_0322 {
    static class Solution {
        public int coinChange(int[] coins, int amount) {
            int[] dp = new int[amount + 1];
            Arrays.fill(dp, Integer.MAX_VALUE - 1);
            dp[0] = 0;
            for (int coin : coins) {
                for (int j = coin; j <= amount; j++) {
                    dp[j] = Integer.min(dp[j], dp[j - coin] + 1);
                }
            }
            return dp[amount] == Integer.MAX_VALUE - 1 ? -1 : dp[amount];
        }
    }
}
