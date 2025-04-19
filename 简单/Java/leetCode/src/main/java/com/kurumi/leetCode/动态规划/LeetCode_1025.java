package com.kurumi.leetCode.动态规划;

/**
 * @author kurumi
 * @date 2025/04/19 21:11
 * @description 1025. 除数博弈
 */
public class LeetCode_1025 {
    public boolean divisorGame(int n) {
        boolean[] dp = new boolean[n + 2];
        dp[1] = false;
        dp[2] = true;
        for (int i = 3; i <= n; i++) {
            // 遍历i的因子
            for (int j = 1; j < i; j++) {
                // 若选择i的因子j使得博弈结果必败，则i必胜
                if (i % j == 0 && !dp[i-j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
