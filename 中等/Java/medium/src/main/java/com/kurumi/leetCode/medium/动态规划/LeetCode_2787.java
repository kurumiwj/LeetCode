package com.kurumi.leetCode.medium.动态规划;

/**
 * @Author kurumi
 * @Date 2026年7月10日 16:09:53
 * @Description 2787. 将一个数字表示成幂的和的方案数
 */
public class LeetCode_2787 {
    static class Solution {
        public int numberOfWays(int n, int x) {
            int MOD = 1_000_000_007;
            int[][] dp = new int[n + 1][n + 1];
            dp[0][0] = 1;
            for (int i = 1; i <= n; i++) {
                int val = (int) Math.pow(i, x);
                for (int j = 0; j <= n; j++) {
                    if (j < val) dp[i][j] = dp[i - 1][j];
                    else dp[i][j] = (dp[i - 1][j - val] + dp[i - 1][j]) % MOD;
                }
            }
            return dp[n][n] % MOD;
        }
    }

    static class Solution1 {
        public int numberOfWays(int n, int x) {
            int MOD = 1_000_000_007;
            int[] dp = new int[n + 1];
            dp[0] = 1;
            for (int i = 1; Math.pow(i, x) <= n; i++) {
                int val = (int) Math.pow(i, x);
                for (int j = n; j >= val; j--) dp[j] = (dp[j - val] + dp[j]) % MOD;
            }
            return dp[n] % MOD;
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.numberOfWays(4,1));
        System.out.println(solution.numberOfWays(10,2));
    }
}
