package com.kurumi.leetCode.动态规划;

/**
 * @Author kurumi
 * @Date 2026-07-06 下午3:20:53
 * @Description 1143. 最长公共子序列
 */
public class LeetCode_1143 {
    static class Solution {
        public int longestCommonSubsequence(String text1, String text2) {
            char[] chs1 = text1.toCharArray(), chs2 = text2.toCharArray();
            int[][] dp = new int[chs1.length + 1][chs2.length + 1];
            for (int i = 0; i < chs1.length; i++) {
                for (int j = 0; j < chs2.length; j++) {
                    if (chs1[i] == chs2[j]) dp[i + 1][j + 1] = dp[i][j] + 1;
                    else dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
            return dp[chs1.length][chs2.length];
        }
    }

    static class Solution1 {
        public int longestCommonSubsequence(String text1, String text2) {
            char[] chs1 = text1.toCharArray(), chs2 = text2.toCharArray();
            int[] dp = new int[chs2.length + 1];
            for (int i = 0; i < chs1.length; i++) {
                int pre = dp[0];
                for (int j = 0; j < chs2.length; j++) {
                    int tmp = dp[j + 1];
                    if (chs1[i] == chs2[j]) dp[j + 1] = pre + 1;
                    else dp[j + 1] = Math.max(dp[j + 1], dp[j]);
                    pre = tmp;
                }
            }
            return dp[chs2.length];
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.longestCommonSubsequence("abcde", "ace"));
        System.out.println(solution.longestCommonSubsequence("abc", "abc"));
        System.out.println(solution.longestCommonSubsequence("abc", "def"));
    }
}
