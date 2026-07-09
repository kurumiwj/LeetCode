package com.kurumi.leetCode.codeThoughts.动态规划._01_基础题目;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 343. 整数拆分
 */
public class LeetCode_0343 {
    static class Solution {
        public int integerBreak(int n) {
            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 0;
            dp[2] = 1;
            for (int i = 3; i <= n; i++)
                for (int j = 1; j <= i / 2; j++) {
                    dp[i] = Integer.max(dp[i], Integer.max(j * dp[i - j], j * (i - j)));
                }
            return dp[n];
        }
    }
}
