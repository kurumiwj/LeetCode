package com.kurumi.scientificPractice.动态规划.入门DP.爬楼梯;

/**
 * @Author kurumi
 * @Date 2026-07-08 下午5:01:07
 * @Description 3693. 爬楼梯 II
 */
public class LeetCode_3693 {
    static class Solution {
        public int climbStairs(int n, int[] costs) {
            int l = costs.length;
            if (l == 1) return costs[0] + 1;
            int[] dp = new int[n + 1];
            dp[1] = costs[0] + 1;
            dp[2] = Math.min(4, dp[1] + 1) + costs[1];
            for (int i = 3; i <= n; i++) {
                int c1 = dp[i - 1] + 1;
                int c2 = dp[i - 2] + 4;
                int c3 = dp[i - 3] + 9;
                dp[i] = Math.min(Math.min(c1, c2), c3) + costs[i - 1];
            }
            return dp[n];
        }
    }

    static class Solution1 {
        public int climbStairs(int n, int[] costs) {
            int l = costs.length;
            if (l == 1) return costs[0] + 1;
            int d0 = 0;
            int d1 = costs[0] + 1;
            int d2 = Math.min(4, d1 + 1) + costs[1];
            for (int i = 3; i <= n; i++) {
                int c1 = d2 + 1;
                int c2 = d1 + 4;
                int c3 = d0 + 9;
                int preD2 = d2;
                d2 = Math.min(Math.min(c1, c2), c3) + costs[i - 1];
                d0 = d1;
                d1 = preD2;
            }
            return d2;
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.climbStairs(4, new int[] {1,2,3,4}));
        System.out.println(solution.climbStairs(4, new int[] {5,1,6,2}));
        System.out.println(solution.climbStairs(3, new int[] {9,8,3}));
    }
}
