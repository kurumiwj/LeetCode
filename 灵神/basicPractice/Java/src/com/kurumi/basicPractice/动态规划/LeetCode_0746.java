package com.kurumi.basicPractice.动态规划;

/**
 * @Author kurumi
 * @Date 2026-07-08 下午4:41:59
 * @Description 746. 使用最小花费爬楼梯
 */
public class LeetCode_0746 {
    static class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int n = cost.length;
            int[] dp = new int[n + 1];
            for (int i = 2; i <= n; i++) dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
            return dp[n];
        }
    }

    static class Solution1 {
        public int minCostClimbingStairs(int[] cost) {
            int n = cost.length;
            int d0 = 0, d1 = 0;
            for (int i = 2; i <= n; i++) {
                int preD1 = d1;
                d1 = Math.min(d1 + cost[i - 1], d0 + cost[i - 2]);
                d0 = preD1;
            }
            return d1;
        }
    }
}
