package com.kurumi.leetCode.basicPractice.动态规划.线性DP1;

/**
 * @Author kurumi
 * @Date 2026年7月20日 16:34:25
 * @Description 1092. 最短公共超序列
 */
public class LeetCode_1092 {
    static class Solution {
        private int[][] cache;

        public String shortestCommonSupersequence(String str1, String str2) {
            cache = new int[str1.length()][str2.length()];
            return answer(str1, str2, str1.length() - 1, str2.length() - 1);
        }

        private int dfs(String str1, String str2, int i, int j) {
            if (i < 0) return j + 1;
            if (j < 0) return i + 1;
            if (cache[i][j] > 0) return cache[i][j];
            if (str1.charAt(i) == str2.charAt(j)) return cache[i][j] = dfs(str1, str2, i - 1, j - 1) + 1;
            return cache[i][j] = Math.min(dfs(str1, str2, i - 1, j), dfs(str1, str2, i, j - 1)) + 1;
        }

        private String answer(String str1, String str2, int i, int j) {
            if (i < 0) return str2.substring(0, j + 1);
            if (j < 0) return str1.substring(0, i + 1);
            if (str1.charAt(i) == str2.charAt(j)) return answer(str1, str2, i - 1, j - 1) + str1.charAt(i);
            if (dfs(str1, str2, i, j) == dfs(str1, str2, i - 1, j) + 1) return answer(str1, str2, i - 1, j) + str1.charAt(i);
            else return answer(str1, str2, i, j - 1) + str2.charAt(j);
        }
    }

    static class Solution1 {
        public String shortestCommonSupersequence(String str1, String str2) {
            char[] chs1 = str1.toCharArray(), chs2 = str2.toCharArray(), res;
            int n = chs1.length, m = chs2.length;
            int[][] dp = new int[n + 1][m + 1];
            for (int i = 1; i <= n; i++) dp[i][0] = i;
            for (int j = 1; j <= m; j++) dp[0][j] = j;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (chs1[i] == chs2[j]) dp[i + 1][j + 1] = dp[i][j] + 1;
                    else dp[i + 1][j + 1] = Math.min(dp[i + 1][j], dp[i][j + 1]) + 1;
                }
            }
            int len = dp[n][m];
            res = new char[len];
            for (int i = n - 1, j = m - 1, k = len - 1;;) {
                if (i < 0) {
                    System.arraycopy(chs2, 0, res, 0, j + 1);
                    break;
                }
                if (j < 0) {
                    System.arraycopy(chs1, 0, res, 0, i + 1);
                    break;
                }
                if (chs1[i] == chs2[j]) {
                    res[k--] = chs1[i--];
                    --j;
                } else if (dp[i + 1][j + 1] == dp[i][j + 1] + 1) res[k--] = chs1[i--];
                else res[k--] = chs2[j--];
            }
            return new String(res);
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.shortestCommonSupersequence("abac", "cab"));
    }
}
