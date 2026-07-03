package com.kurumi.codeThoughts.动态规划._04_股票问题;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 121. 买卖股票的最佳时机
 */
public class LeetCode_0121 {
    static class Solution {
        public int maxProfit(int[] prices) {
            int[] dp = new int[] { -prices[0], 0 };
            for (int i = 1; i <= prices.length; i++) {
                dp[0] = Math.max(dp[0], -prices[i - 1]);
                dp[1] = Math.max(dp[1], dp[0] + prices[i - 1]);
            }
            return dp[1];
        }
    }
}
