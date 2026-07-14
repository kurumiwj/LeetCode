package com.kurumi.leetCode.basicPractice.动态规划.背包;

/**
 * @Author kurumi
 * @Date 2026年7月13日 09:48:05
 * @Description 518. 零钱兑换 II
 */
public class LeetCode_0518 {
    static class Solution {
        public int change(int amount, int[] coins) {
            int n = coins.length;
            int[][] dp = new int[n + 1][amount + 1];
            dp[0][0] = 1;
            for (int i = 0; i < n; i++) {
                int coin = coins[i];
                for (int j = 0; j <= amount; j++) {
                    if (j < coin) dp[i + 1][j] = dp[i][j];
                    else dp[i + 1][j] = dp[i + 1][j - coin] + dp[i][j];
                }
            }
            return dp[n][amount];
        }
    }

    static class Solution1 {
        public int change(int amount, int[] coins) {
            int n = coins.length;
            int[] dp = new int[amount + 1];
            dp[0] = 1;
            for (int coin : coins) {
                for (int j = coin; j <= amount; j++) {
                    dp[j] += dp[j - coin];
                }
            }
            return dp[amount];
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.change(5, new int[] {1,2,5}));
    }
}
