package com.kurumi.leetCode.basicPractice.动态规划.递推;

/**
 * @Author kurumi
 * @Date 2026-07-09 上午10:31:08
 * @Description 2466. 统计构造好字符串的方案数
 */
public class LeetCode_2466 {
    static class Solution {
        public int countGoodStrings(int low, int high, int zero, int one) {
            int MOD = 1_000_000_007;
            int[] dp = new int[high + 1];
            int res = 0;
            dp[0] = 1;
            for (int i = 1; i <= high; i++) {
                if (i >= zero) dp[i] = dp[i - zero];
                if (i >= one) dp[i] = (dp[i] + dp[i - one]) % MOD;
                if (i >= low) res = (res + dp[i]) % MOD;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countGoodStrings(3, 3, 1, 1));
        System.out.println(solution.countGoodStrings(2,3,1,2));
        System.out.println(solution.countGoodStrings(200,200,10,1));
        System.out.println(solution.countGoodStrings(1,100000,1,1));
    }
}
