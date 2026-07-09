package com.kurumi.leetCode.codeThoughts.动态规划._05_子序列问题._03_编辑距离;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 115. 不同的子序列
 */
public class LeetCode_0115 {
    static class Solution {
        public int numDistinct(String s, String t) {
            int[][] dp = new int[s.length() + 1][t.length() + 1];
            for (int i = 0; i < s.length() + 1; i++)
                dp[i][0] = 1;
            for (int j = 1; j < t.length() + 1; j++)
                dp[0][j] = 0;
            for (int i = 1; i < s.length() + 1; i++) {
                for (int j = 1; j < t.length() + 1; j++) {
                    if (s.charAt(i - 1) == t.charAt(j - 1))
                        dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                    else
                        dp[i][j] = dp[i - 1][j];
                }
            }
            return dp[s.length()][t.length()];
        }
    }
}
