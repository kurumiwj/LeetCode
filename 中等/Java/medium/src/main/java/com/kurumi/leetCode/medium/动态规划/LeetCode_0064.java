package com.kurumi.leetCode.medium.动态规划;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026年7月10日 10:58:46
 * @Description LeetCode_0064
 */
public class LeetCode_0064 {
    static class Solution {
        public int minPathSum(int[][] grid) {
            int m = grid.length, n = grid[0].length;
            int[][] dp = new int[m][n];
            dp[0][0] = grid[0][0];
            for (int i = 1; i < m; i++) dp[i][0] = dp[i - 1][0] + grid[i][0];
            for (int j = 1; j < n; j++) dp[0][j] = dp[0][j - 1] + grid[0][j];
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
                }
            }
            return dp[m - 1][n - 1];
        }
    }

    static class Solution1 {
        public int minPathSum(int[][] grid) {
            int n = grid[0].length;
            int[] dp = new int[n];
            Arrays.fill(dp, Integer.MAX_VALUE);
            dp[0] = 0;
            for (int[] row : grid) {
                dp[0] += row[0];
                for (int j = 1; j < n; j++) dp[j] = Math.min(dp[j], dp[j - 1]) + row[j];
            }
            return dp[n - 1];
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[][] grid = new int[][] {
            new int[] {1,3,1},
            new int[] {1,5,1},
            new int[] {4,2,1}
        };
        System.out.println(solution.minPathSum(grid));
    }
}
