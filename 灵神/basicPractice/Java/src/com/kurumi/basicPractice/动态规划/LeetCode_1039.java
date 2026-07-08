package com.kurumi.basicPractice.动态规划;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-07-07 下午5:29:15
 * @Description 1039. 多边形三角剖分的最低得分
 */
public class LeetCode_1039 {
    static class Solution {
        public int minScoreTriangulation(int[] values) {
            int n = values.length;
            int[][] dp = new int[n][n];
            for (int i = n - 3; i >= 0; i--) {
                for (int j = i + 2; j < n; j++) {
                    int res = Integer.MAX_VALUE;
                    for (int k = i + 1; k < j; k++) res = Math.min(res, dp[i][k] + dp[k][j] + values[i] * values[j] * values[k]);
                    dp[i][j] = res;
                }
            }
            return dp[0][n - 1];
        }
    }

    static class Solution1 {
        private int[][] cache;

        private int dfs(int[] v, int i, int j) {
            if (i + 1 == j) return 0;
            if (cache[i][j] != -1) return cache[i][j];
            int res = Integer.MAX_VALUE;
            for (int k = i + 1; k < j; k++) res = Math.min(res, v[i] * v[j] * v[k] + dfs(v, i, k) + dfs(v, k, j));
            cache[i][j] = res;
            return res;
        }

        public int minScoreTriangulation(int[] values) {
            int n = values.length;
            cache = new int[n][n];
            for (int i = 0; i < n; i++) Arrays.fill(cache[i], -1);
            return dfs(values, 0, n - 1);
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.minScoreTriangulation(new int[] {3,7,4,5}));
        System.out.println(solution.minScoreTriangulation(new int[] {1,3,1,4,1,5}));
    }
}
