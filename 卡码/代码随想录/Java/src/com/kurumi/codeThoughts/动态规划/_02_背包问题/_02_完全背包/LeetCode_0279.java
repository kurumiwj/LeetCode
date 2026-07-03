package com.kurumi.codeThoughts.动态规划._02_背包问题._02_完全背包;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 279. 完全平方数
 */
public class LeetCode_0279 {
    static class Solution {
        public int numSquares(int n) {
            int[] dp = new int[n + 1];
            Arrays.fill(dp, Integer.MAX_VALUE - 1);
            dp[0] = 0;
            for (int i = 1; i * i <= n; i++) {
                for (int j = i * i; j <= n; j++) {
                    dp[j] = Math.min(dp[j], dp[j - i * i] + 1);
                }
            }
            return dp[n];
        }
    }
}
