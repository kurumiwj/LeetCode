package com.kurumi.leetCode.basicPractice.动态规划.状态机DP;

/**
 * @Author kurumi
 * @Date 2026-07-06 下午6:09:53
 * @Description 121. 买卖股票的最佳时机
 */
public class LeetCode_0121 {
    static class Solution {
        public int maxProfit(int[] prices) {
            int[][] dp = new int[prices.length][2]; // 0持有，1未持有
            dp[0][0] = -prices[0];
            dp[0][1] = 0;
            for (int i = 1; i < prices.length; i++) {
                dp[i][0] = Math.max(dp[i - 1][0], -prices[i]);
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i]);
            }
            return Math.max(dp[prices.length - 1][0], dp[prices.length - 1][1]);
        }
    }

    static class Solution1 {
        public int maxProfit(int[] prices) {
            int[] dp = new int[2]; // 0持有，1未持有
            dp[0] = -prices[0];
            dp[1] = 0;
            for (int price : prices) {
                dp[0] = Math.max(dp[0], -price);
                dp[1] = Math.max(dp[1], dp[0] + price);
            }
            return dp[1];
        }
    }

    static class Solution2 {
        public int maxProfit(int[] prices) {
            int unhold = 0, hold = -prices[0];
            for (int price : prices) {
                hold = Math.max(hold, -price);
                unhold = Math.max(unhold, hold + price);
            }
            return unhold;
        }
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println(solution.maxProfit(new int[] {7,6,4,3,1}));
    }
}
