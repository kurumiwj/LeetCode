package com.kurumi.leetCode.basicPractice.动态规划.状态机DP;

/**
 * @Author kurumi
 * @Date 2026-07-07 下午3:47:14
 * @Description 714. 买卖股票的最佳时机含手续费
 */
public class LeetCode_0714 {
    static class Solution {
        public int maxProfit(int[] prices, int fee) {
            int[][] dp = new int[prices.length][2];
            dp[0][0] = -prices[0];
            dp[0][1] = 0;
            for (int i = 1; i < prices.length; i++) {
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i] - fee);
            }
            return dp[prices.length - 1][1];
        }
    }

    static class Solution1 {
        public int maxProfit(int[] prices, int fee) {
            int hold = -prices[0], unhold = 0;
            for (int price : prices) {
                int preHold = hold, preUnhold = unhold;
                hold = Math.max(preHold, preUnhold - price);
                unhold = Math.max(preUnhold, preHold + price - fee);
            }
            return unhold;
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.maxProfit(new int[] {1, 3, 2, 8, 4, 9}, 2));
        System.out.println(solution.maxProfit(new int[] {1,3,7,5,10,3}, 3));
    }
}
