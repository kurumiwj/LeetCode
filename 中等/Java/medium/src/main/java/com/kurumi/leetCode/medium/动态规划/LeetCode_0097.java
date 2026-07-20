package com.kurumi.leetCode.medium.动态规划;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026年7月16日 12:49:18
 * @Description 97. 交错字符串
 */
public class LeetCode_0097 {
    static class Solution {
        private int[][] cache;

        private boolean dfs(int i, int j, char[] chs1, char[] chs2, char[] chs3) {
            if (i < 0 && j < 0) return true;
            if (cache[i + 1][j + 1] != -1) return cache[i + 1][j + 1] == 1;
            boolean res = i >= 0 && chs1[i] == chs3[i + j + 1] && dfs(i - 1, j, chs1, chs2, chs3) ||
                j >= 0 && chs2[j] == chs3[i + j + 1] && dfs(i, j - 1, chs1, chs2, chs3);
            cache[i + 1][j + 1] = res ? 1 : 0;
            return res;
        }

        public boolean isInterleave(String s1, String s2, String s3) {
            int n = s1.length(), m = s2.length();
            if (n + m != s3.length()) return false;
            cache = new int[n + 1][m + 1];
            for (int[] c : cache) Arrays.fill(c, -1);
            return dfs(n - 1, m - 1, s1.toCharArray(), s2.toCharArray(), s3.toCharArray());
        }
    }

    static class Solution1 {
        public boolean isInterleave(String s1, String s2, String s3) {
            int n = s1.length(), m = s2.length();
            if (n + m != s3.length()) return false;
            char[] chs1 = s1.toCharArray(), chs2 = s2.toCharArray(), chs3 = s3.toCharArray();
            boolean[][] dp = new boolean[n + 1][m + 1];
            dp[0][0] = true;
            for (int i = 0; i < n; i++) dp[i + 1][0] = chs1[i] == chs3[i] && dp[i][0];
            for (int j = 0; j < m; j++) dp[0][j + 1] = chs2[j] == chs3[j] && dp[0][j];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    dp[i + 1][j + 1] = chs1[i] == chs3[i + j + 1] && dp[i][j + 1] ||
                        chs2[j] == chs3[i + j + 1] && dp[i + 1][j];
                }
            }
            return dp[n][m];
        }
    }

    static class Solution2 {
        public boolean isInterleave(String s1, String s2, String s3) {
            int n = s1.length(), m = s2.length();
            if (n + m != s3.length()) return false;
            char[] chs1 = s1.toCharArray(), chs2 = s2.toCharArray(), chs3 = s3.toCharArray();
            boolean[] dp = new boolean[m + 1];
            dp[0] = true;
            for (int j = 0; j < m; j++) dp[j + 1] = chs2[j] == chs3[j] && dp[j];
            for (int i = 0; i < n; i++) {
                dp[0] = chs1[i] == chs3[i] && dp[0];
                for (int j = 0; j < m; j++) {
                    dp[j + 1] = chs1[i] == chs3[i + j + 1] && dp[j + 1]
                        || chs2[j] == chs3[i + j + 1] && dp[j];
                }
            }
            return dp[m];
        }
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        System.out.println(solution.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
        System.out.println(solution.isInterleave("", "", ""));
        System.out.println(solution.isInterleave("a", "", ""));
    }
}
