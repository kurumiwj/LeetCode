package com.kurumi.codeThoughts.动态规划._04_股票问题;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 188. 买卖股票的最佳时机 IV
 */
public class LeetCode_0188 {
    static class Solution {
        public int maxProfit(int k, int[] prices) {
            int[] dp = new int[2 * k];
            for (int i = 0; i < 2 * k; i += 2)
                dp[i] = -prices[0];
            for (int i = 1; i < prices.length; i++) {
                dp[0] = Math.max(dp[0], -prices[i]);
                dp[1] = Math.max(dp[1], dp[0] + prices[i]);
                for (int j = 2; j < 2 * k; j += 2) {
                    dp[j] = Math.max(dp[j], dp[j - 1] - prices[i]);
                    dp[j + 1] = Math.max(dp[j + 1], dp[j] + prices[i]);
                }
            }
            return dp[2 * k - 1];
        }
    }
}
