package com.kurumi.leetCode.basicPractice.动态规划.状态机DP;

/**
 * @Author kurumi
 * @Date 2026-07-06 下午5:36:16
 * @Description 122. 买卖股票的最佳时机 II
 */
public class LeetCode_0122 {
    static class Solution {
        public int maxProfit(int[] prices) {
            int[][] dp = new int[prices.length][2]; // 0持有，1不持有
            dp[0][0] = -prices[0];
            dp[0][1] = 0;
            for (int i = 1; i < prices.length; i++) {
                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i]);
            }
            return dp[prices.length - 1][1];
        }
    }

    static class Solution1 {
        public int maxProfit(int[] prices) {
            int[] dp = new int[2]; // 0持有，1不持有
            dp[0] = -prices[0];
            dp[1] = 0;
            for (int price : prices) {
                dp[0] = Math.max(dp[0], dp[1] - price);
                dp[1] = Math.max(dp[1], dp[0] + price);
            }
            return dp[1];
        }
    }

    static class Solution2 {
        public int maxProfit(int[] prices) {
            int hold = -prices[0], unhold = 0;
            for (int price : prices) {
                hold = Math.max(hold, unhold - price);
                unhold = Math.max(unhold, hold + price);
            }
            return unhold;
        }
    }

    // 贪心
    static class Solution3 {
        public int maxProfit(int[] prices) {
            int res = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1]) res += (prices[i] - prices[i - 1]);
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        System.out.println(solution.maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println(solution.maxProfit(new int[] {1,2,3,4,5}));
        System.out.println(solution.maxProfit(new int[] {7,6,4,3,1}));
    }
}
