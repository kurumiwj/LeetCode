// 121. 买卖股票的最佳时机
package com.kurumi.leetCode.数组;

/**
 * @author: kurumi
 * @date: 2024-10-16 21:47:38
 */
public class LeetCode_0121 {
    public int maxProfit(int[] prices) {
        int[] dp = new int[]{-prices[0], 0};
        for (int i = 1; i <= prices.length; i++) {
            dp[0] = Math.max(dp[0], -prices[i - 1]);
            dp[1] = Math.max(dp[1], dp[0] + prices[i - 1]);
        }
        return dp[1];
    }
}
