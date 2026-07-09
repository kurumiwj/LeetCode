package com.kurumi.leetCode.medium.动态规划;

/**
 * @Author kurumi
 * @Date 2026-07-06 下午3:51:18
 * @Description 72. 编辑距离
 */
public class LeetCode_0072 {
    static class Solution {
        public int minDistance(String word1, String word2) {
            char[] chs1 = word1.toCharArray(), chs2 = word2.toCharArray();
            int[][] dp = new int[chs1.length + 1][chs2.length + 1];
            for (int i = 0; i < chs1.length; i++) dp[i + 1][0] = i + 1;
            for (int j = 0; j < chs2.length; j++) dp[0][j + 1] = j + 1;
            for (int i = 0; i < chs1.length; i++) {
                for (int j = 0; j < chs2.length; j++) {
                    if (chs1[i] == chs2[j]) dp[i + 1][j + 1] = dp[i][j];
                    else dp[i + 1][j + 1] = Math.min(Math.min(dp[i][j + 1], dp[i + 1][j]), dp[i][j]) + 1;
                }
            }
            return dp[chs1.length][chs2.length];
        }
    }

    static class Solution1 {
        public int minDistance(String word1, String word2) {
            char[] chs1 = word1.toCharArray(), chs2 = word2.toCharArray();
            int[] dp = new int[chs2.length + 1];
            for (int j = 0; j < chs2.length; j++) dp[j + 1] = j + 1;
            for (char ch : chs1) {
                int pre = dp[0];
                ++dp[0];
                for (int j = 0; j < chs2.length; j++) {
                    int tmp = dp[j + 1];
                    if (ch == chs2[j]) dp[j + 1] = pre;
                    else dp[j + 1] = Math.min(Math.min(dp[j + 1], dp[j]), pre) + 1;
                    pre = tmp;
                }
            }
            return dp[chs2.length];
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.minDistance("horse", "ros"));
        System.out.println(solution.minDistance("intention", "execution"));
    }
}
