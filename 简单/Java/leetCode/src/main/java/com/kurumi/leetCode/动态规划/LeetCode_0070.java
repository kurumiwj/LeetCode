// 70. 爬楼梯
package com.kurumi.leetCode.动态规划;

/**
 * @author: kurumi
 * @date: 2024-10-16 20:06:08
 **/
public class LeetCode_0070 {
    public int climbStairs(int n) {
        if (n <= 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
