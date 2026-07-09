package com.kurumi.leetCode.basicPractice.动态规划;

/**
 * @Author kurumi
 * @Date 2026-07-08 下午2:48:12
 * @Description 70. 爬楼梯
 */
public class LeetCode_0070 {
    static class Solution {
        public int climbStairs(int n) {
            int[] dp = new int[n + 1];
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n];
        }
    }

    static class Solution1 {
        public int climbStairs(int n) {
            int d0 = 1, d1 = 1;
            for (int i = 2; i <= n; i++) {
                int preD0 = d0;
                d0 = d1;
                d1 = preD0 + d1;
            }
            return d1;
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.climbStairs(3));
    }
}
