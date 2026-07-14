package com.kurumi.leetCode.basicPractice.动态规划.区间DP;

/**
 * @Author kurumi
 * @Date 2026-07-07 下午3:56:57
 * @Description 516. 最长回文子序列
 */
public class LeetCode_0516 {
    static class Solution {
        public int longestPalindromeSubseq(String s) {
            if (s.length() == 0 || s.length() == 1) return s.length();
            char[] chs = s.toCharArray();
            int[][] dp = new int[chs.length][chs.length];
            for (int i = 0; i < chs.length; i++) dp[i][i] = 1;
            for (int i = chs.length - 1; i >= 0; i--) {
                for (int j = i + 1; j < chs.length; j++) {
                    if (chs[i] == chs[j]) dp[i][j] = dp[i + 1][j - 1] + 2;
                    else dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
            return dp[0][chs.length - 1];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindromeSubseq("bbbab"));
        System.out.println(solution.longestPalindromeSubseq("cbbd"));
    }
}
