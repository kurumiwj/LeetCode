package com.kurumi.leetCode.basicPractice.动态规划.背包;

/**
 * @Author kurumi
 * @Date 2026年7月10日 15:42:10
 * @Description 416. 分割等和子集
 */
public class LeetCode_0416 {
    static class Solution {
        public boolean canPartition(int[] nums) {
            int sum = nums[0], n = nums.length;
            for (int i = 1; i < nums.length; i++) sum += nums[i];
            if (sum % 2 != 0) return false;
            int[][] dp = new int[n + 1][sum + 1];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= sum / 2; j++) {
                    if (j < nums[i]) dp[i + 1][j] = dp[i][j];
                    else dp[i + 1][j] = Math.max(dp[i][j - nums[i]] + nums[i], dp[i][j]);
                }
            }
            return dp[n][sum / 2] == sum / 2;
        }
    }

    static class Solution1 {
        public boolean canPartition(int[] nums) {
            int sum = nums[0];
            for (int i = 1; i < nums.length; i++) sum += nums[i];
            if (sum % 2 != 0) return false;
            int[] dp = new int[sum + 1];
            for (int num : nums) {
                for (int j = sum / 2; j >= num; j--) dp[j] = Math.max(dp[j - num] + num, dp[j]);
            }
            return dp[sum / 2] == sum / 2;
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.canPartition(new int[] {1,5,11,5}));
        System.out.println(solution.canPartition(new int[] {1, 2, 5}));
    }
}
