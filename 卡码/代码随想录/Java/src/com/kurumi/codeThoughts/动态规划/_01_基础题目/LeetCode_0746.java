package com.kurumi.codeThoughts.动态规划._01_基础题目;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 746. 使用最小花费爬楼梯
 */
public class LeetCode_0746 {
    static class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int[] dp = new int[cost.length + 1];
            dp[0] = 0;
            dp[1] = 0;
            for (int i = 2; i <= cost.length; i++) {
                dp[i] = Integer.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
            }
            return dp[cost.length];
        }
    }
}
