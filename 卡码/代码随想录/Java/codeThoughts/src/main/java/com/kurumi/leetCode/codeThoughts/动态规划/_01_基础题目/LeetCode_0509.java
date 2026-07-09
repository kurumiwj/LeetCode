package com.kurumi.leetCode.codeThoughts.动态规划._01_基础题目;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 509. 斐波那契数
 */
public class LeetCode_0509 {
    static class Solution {
        public int fib(int n) {
            if (n <= 1)
                return n;
            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 1;
            for (int i = 2; i <= n; i++)
                dp[i] = dp[i - 1] + dp[i - 2];
            return dp[n];
        }
    }
}
