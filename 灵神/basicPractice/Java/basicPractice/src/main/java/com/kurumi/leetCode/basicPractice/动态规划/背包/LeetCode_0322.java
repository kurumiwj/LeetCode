package com.kurumi.leetCode.basicPractice.动态规划.背包;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-07-06 下午2:23:46
 * @Description 322. 零钱兑换
 */
public class LeetCode_0322 {
    static class Solution {
        public int coinChange(int[] coins, int amount) {
            int[][] dp = new int[coins.length + 1][amount + 1];
            Arrays.fill(dp[0], Integer.MAX_VALUE - 1);
            dp[0][0] = 0;
            for (int i = 0; i < coins.length; i++) {
                for (int j = 0; j <= amount; j++) {
                    if (j >= coins[i]) dp[i + 1][j] = Math.min(dp[i][j], dp[i + 1][j - coins[i]] + 1);
                    else dp[i + 1][j] = dp[i][j];
                }
            }
            return dp[coins.length][amount] < Integer.MAX_VALUE - 1 ? dp[coins.length][amount] : -1;
        }
    }

    static class Solution1 {
        public int coinChange(int[] coins, int amount) {
            int[] dp = new int[amount + 1];
            Arrays.fill(dp, Integer.MAX_VALUE - 1);
            dp[0] = 0;
            for (int coin : coins) {
                for (int j = coin; j <= amount; j++) dp[j] = Math.min(dp[j], dp[j - coin] + 1);
            }
            return dp[amount] < Integer.MAX_VALUE - 1 ? dp[amount] : -1;
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.coinChange(new int[] {1,2,5}, 11));
        System.out.println(solution.coinChange(new int[] {2}, 3));
        System.out.println(solution.coinChange(new int[] {1}, 0));
    }
}
