package com.kurumi.leetCode.动态规划;

/**
 * @Author kurumi
 * @Date 2025/04/20 14:06
 * @Description 1137. 第 N 个泰波那契数
 */
public class LeetCode_1137 {
    public int tribonacci(int n) {
        int[] dp = new int[40];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }
}
