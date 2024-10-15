// 746. 使用最小花费爬楼梯
package com.kurumi.leetCode.动态规划;

/**
 * @author: kurumi
 * @date: 2024-10-16 21:58:27
 */
public class LeetCode_0746 {
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
