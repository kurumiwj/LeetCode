package com.kurumi.leetCode.codeThoughts.动态规划._05_子序列问题._04_回文;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 516. 最长回文子序列
 */
public class LeetCode_0516 {
    static class Solution {
        public int longestPalindromeSubseq(String s) {
            int n = s.length();
            int[][] dp = new int[n][n];
            for (int i = 0; i < n; i++)
                dp[i][i] = 1;
            for (int i = n - 1; i >= 0; i--) {
                for (int j = i + 1; j < n; j++) {
                    if (s.charAt(i) == s.charAt(j))
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    else
                        dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
            return dp[0][n - 1];
        }
    }
}
