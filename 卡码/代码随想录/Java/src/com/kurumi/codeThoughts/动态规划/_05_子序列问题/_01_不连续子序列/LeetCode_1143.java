package com.kurumi.codeThoughts.动态规划._05_子序列问题._01_不连续子序列;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 1143. 最长公共子序列
 */
public class LeetCode_1143 {
    static class Solution {
        public int longestCommonSubsequence(String text1, String text2) {
            int[][] dp = new int[text1.length() + 1][text2.length() + 1];
            for (int i = 1; i <= text1.length(); i++) {
                for (int j = 1; j <= text2.length(); j++) {
                    if (text1.charAt(i - 1) == text2.charAt(j - 1))
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    else
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
            return dp[text1.length()][text2.length()];
        }
    }
}
