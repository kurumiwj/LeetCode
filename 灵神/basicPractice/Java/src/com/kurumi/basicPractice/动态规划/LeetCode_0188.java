package com.kurumi.basicPractice.动态规划;

/**
 * @Author kurumi
 * @Date 2026-07-07 下午2:56:07
 * @Description 188. 买卖股票的最佳时机 IV
 */
public class LeetCode_0188 {
    static class Solution {
        public int maxProfit(int k, int[] prices) {
            int[][] dp = new int[prices.length][2 * k + 1]; // 奇数持有，偶数不持有
            for (int j = 0; j < 2 * k; j+=2) {
                dp[0][j + 1] = -prices[0];
                dp[0][j + 2] = 0;
            }
            for (int i = 1; i < prices.length; i++) {
                for (int j = 0; j < 2 * k; j+=2) {
                    dp[i][j + 1] = Math.max(dp[i - 1][j + 1], dp[i - 1][j] - prices[i]);
                    dp[i][j + 2] = Math.max(dp[i - 1][j + 2], dp[i - 1][j + 1] + prices[i]);
                }
            }
            return dp[prices.length - 1][2 * k];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(2, new int[] {2,4,1}));
        System.out.println(solution.maxProfit(2, new int[] {3,2,6,5,0,3}));
    }
}
