package com.kurumi.leetCode.codeThoughts.动态规划._01_基础题目;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 96. 不同的二叉搜索树
 */
public class LeetCode_0096 {
    static class Solution {
        public int numTrees(int n) {
            int[] dp = new int[n + 1];
            dp[0] = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    dp[i] += dp[j - 1] * dp[i - j];
                }
            }
            return dp[n];
        }
    }
}
