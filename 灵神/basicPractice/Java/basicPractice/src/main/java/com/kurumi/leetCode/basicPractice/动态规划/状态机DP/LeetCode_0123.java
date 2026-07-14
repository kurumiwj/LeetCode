package com.kurumi.leetCode.basicPractice.动态规划.状态机DP;

/**
 * @Author kurumi
 * @Date 2026-07-07 下午12:04:01
 * @Description 123. 买卖股票的最佳时机 III
 */
public class LeetCode_0123 {
    static class Solution {
        public int maxProfit(int[] prices) {
            int[][] dp = new int[prices.length][4]; // 0—第一笔持有，1—第一笔不持有，2—第二笔持有，3—第二笔不持有
            dp[0][0] = -prices[0];
            dp[0][1] = 0;
            dp[0][2] = -prices[0];
            dp[0][3] = 0;
            for (int i = 1; i < prices.length; i++) {
                dp[i][0] = Math.max(dp[i - 1][0], -prices[i]);
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i]);
                dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] - prices[i]);
                dp[i][3] = Math.max(dp[i - 1][3], dp[i - 1][2] + prices[i]);
            }
            return dp[prices.length - 1][3];
        }
    }

    static class Solution1 {
        public int maxProfit(int[] prices) {
            int firstHold = -prices[0], firstUnhold = 0, secondHold = -prices[0], secondUnhold = 0;
            for (int price : prices) {
                int preFirstHold = firstHold, preFirstUnhold = firstUnhold, preSecondHold = secondHold;
                firstHold = Math.max(preFirstHold, -price);
                firstUnhold = Math.max(firstUnhold, preFirstHold + price);
                secondHold = Math.max(preSecondHold, preFirstUnhold - price);
                secondUnhold = Math.max(secondUnhold, preSecondHold + price);
            }
            return secondUnhold;
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.maxProfit(new int[] {3,3,5,0,0,3,1,4}));
        System.out.println(solution.maxProfit(new int[] {1,2,3,4,5}));
        System.out.println(solution.maxProfit(new int[] {7,6,4,3,1}));
    }
}
