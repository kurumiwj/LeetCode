package com.kurumi.leetCode.codeThoughts.动态规划._01_基础题目;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 62. 不同路径
 */
public class LeetCode_0062 {
    static class Solution {
        public int uniquePaths(int m, int n) {
            int[][] dp = new int[m][n];
            for (int i = 0; i < n; i++)
                dp[0][i] = 1;
            for (int i = 0; i < m; i++)
                dp[i][0] = 1;
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
            return dp[m - 1][n - 1];
        }
    }
}
