package com.kurumi.leetCode.basicPractice.动态规划.背包;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026年7月13日 11:18:39
 * @Description 279. 完全平方数
 */
public class LeetCode_0279 {
    static class Solution {
        public int numSquares(int n) {
            int[][] dp = new int[101][10001];
            Arrays.fill(dp[0], Integer.MAX_VALUE);
            dp[0][0] = 0;
            for (int i = 1; i * i <= 10000; i++) {
                for (int j = 0; j <= 10000; j++) {
                    if (j < i * i) dp[i][j] = dp[i - 1][j];
                    else dp[i][j] = Math.min(dp[i][j - i * i] + 1, dp[i - 1][j]);
                }
            }
            return dp[100][n];
        }
    }

    static class Solution1 {
        public int numSquares(int n) {
            int[] dp = new int[10001];
            Arrays.fill(dp, Integer.MAX_VALUE);
            dp[0] = 0;
            for (int i = 1; i * i <= 10000; i++) {
                for (int j = i * i; j <= 10000; j++) dp[j] = Math.min(dp[j - i * i] + 1, dp[j]);
            }
            return dp[n];
        }
    }

    static class Solution2 {
        public int numSquares(int n) {
            int[][] dp = new int[n + 1][n + 1];
            Arrays.fill(dp[0], Integer.MAX_VALUE);
            dp[0][0] = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j * j > i) dp[j][i] = dp[j - 1][i];
                    else dp[j][i] = Math.min(dp[j][i - j * j] + 1, dp[j - 1][i]);
                }
            }
            return dp[n][n];
        }
    }

    static class Solution3 {
        public int numSquares(int n) {
            int[] dp = new int[n + 1];
            Arrays.fill(dp, Integer.MAX_VALUE);
            dp[0] = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j * j <= i; j++) dp[i] = Math.min(dp[i - j * j] + 1, dp[i]);
            }
            return dp[n];
        }
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        System.out.println(solution.numSquares(12));
    }
}
