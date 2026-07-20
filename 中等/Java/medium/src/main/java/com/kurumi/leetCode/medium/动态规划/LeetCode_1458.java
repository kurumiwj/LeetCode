package com.kurumi.leetCode.medium.动态规划;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026年7月16日 14:32:42
 * @Description 1458. 两个子序列的最大点积
 */
public class LeetCode_1458 {
    static class Solution {
        private int[][] cache;

        private int dfs(int i, int j, int[] nums1, int[] nums2) {
            if (i < 0 || j < 0) return Integer.MIN_VALUE;
            if (cache[i][j] != Integer.MAX_VALUE) return cache[i][j];
            int val1 = Math.max(dfs(i - 1, j - 1, nums1, nums2), 0) + nums1[i] * nums2[j];
            int val2 = dfs(i - 1, j, nums1, nums2);
            int val3 = dfs(i, j - 1, nums1, nums2);
            cache[i][j] = Math.max(val1, Math.max(val2, val3));
            return cache[i][j];
        }

        public int maxDotProduct(int[] nums1, int[] nums2) {
            int n = nums1.length, m = nums2.length;
            cache = new int[n][m];
            for (int[] row : cache) Arrays.fill(row, Integer.MAX_VALUE);
            return dfs(n - 1, m - 1, nums1, nums2);
        }
    }

    static class Solution1 {
        public int maxDotProduct(int[] nums1, int[] nums2) {
            int n = nums1.length, m = nums2.length;
            int[][] dp = new int[n + 1][m + 1];
            for (int i = 0; i < n; i++) dp[i + 1][0] = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) dp[0][j + 1] = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) dp[i + 1][j + 1] = Math.max(Math.max(dp[i][j + 1], dp[i + 1][j]), Math.max(dp[i][j], 0) + nums1[i] * nums2[j]);
            }
            return dp[n][m];
        }
    }

    static class Solution2 {
        public int maxDotProduct(int[] nums1, int[] nums2) {
            int n = nums1.length, m = nums2.length;
            int[] dp = new int[m + 1];
            for (int j = 0; j < m; j++) dp[j + 1] = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                dp[0] = Integer.MIN_VALUE;
                int pre = dp[0];
                for (int j = 0; j < m; j++){
                    int tmp = dp[j + 1];
                    dp[j + 1] = Math.max(Math.max(dp[j + 1], dp[j]), Math.max(pre, 0) + nums1[i] * nums2[j]);
                    pre = tmp;
                }
            }
            return dp[m];
        }
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.maxDotProduct(new int[] {2,1,-2,5}, new int[] {3,0,-6}));
        System.out.println(solution.maxDotProduct(new int[] {3,-2}, new int[] {2,-6,7}));
        System.out.println(solution.maxDotProduct(new int[] {-1,-1}, new int[] {1,1}));
    }
}
