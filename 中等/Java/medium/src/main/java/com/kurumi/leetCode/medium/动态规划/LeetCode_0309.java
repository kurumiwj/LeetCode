package com.kurumi.leetCode.medium.动态规划;

/**
 * @Author kurumi
 * @Date 2026-07-07 下午3:17:35
 * @Description 309. 买卖股票的最佳时机含冷冻期
 */
public class LeetCode_0309 {
    static class Solution {
        public int maxProfit(int[] prices) {
            int[][] dp = new int[prices.length][4]; // 0—持股，1—保持卖出，2—卖出，3—冷冻期
            dp[0][0] = -prices[0];
            dp[0][1] = 0;
            dp[0][2] = 0;
            dp[0][3] = 0;
            for (int i = 1; i < prices.length; i++) {
                dp[i][0] = Math.max(dp[i - 1][0], Math.max(dp[i - 1][1], dp[i - 1][3]) - prices[i]);
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][3]);
                dp[i][2] = dp[i - 1][0] + prices[i];
                dp[i][3] = dp[i - 1][2];
            }
            return Math.max(Math.max(dp[prices.length - 1][1], dp[prices.length - 1][2]), dp[prices.length - 1][3]);
        }
    }

    static class Solution1 {
        public int maxProfit(int[] prices) {
            int hold = -prices[0], saled = 0, saling = 0, frozen = 0;    // 持股，保持卖出，当天卖出，冷冻期
            for (int price : prices) {
                int preHold = hold, preSaled = saled, preSaling = saling, preFrozen = frozen;
                hold = Math.max(preHold, Math.max(preSaled, preFrozen) - price);
                saled = Math.max(preSaled, preFrozen);
                saling = preHold + price;
                frozen = preSaling;
            }
            return Math.max(Math.max(saled, saling), frozen);
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.maxProfit(new int[] {1,2,3,0,2}));
    }
}
