package com.kurumi.leetCode.动态规划;

/**
 * @Author kurumi
 * @Date 2026-07-06 上午10:54:51
 * @Description 494. 目标和
 */
public class LeetCode_0494 {
    static class Solution {
        public int findTargetSumWays(int[] nums, int target) {
            int sum = 0, n = nums.length;
            for (int i = 0; i < n; i++) {
                sum += nums[i];
            }
            target += sum;
            if (target < 0 || target % 2 != 0) return 0;
            target /= 2;
            int[] dp = new int[target + 1];
            dp[0] = 1;
            for (int num : nums) {
                for (int j = target; j >= num; j--) {
                    dp[j] += dp[j - num];
                }
            }
            return dp[target];
        }
    }

    static class Solution1 {
        public int findTargetSumWays(int[] nums, int target) {
            int sum = 0, n = nums.length;
            for (int i = 0; i < n; i++) {
                sum += nums[i];
            }
            target += sum;
            if (target < 0 || target % 2 != 0) return 0;
            target /= 2;
            int[][] dp = new int[n + 1][target + 1];
            dp[0][0] = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= target; j++) {
                    if (j >= nums[i]) dp[i + 1][j] = dp[i][j] + dp[i][j - nums[i]];
                    else dp[i + 1][j] = dp[i][j];
                }
            }
            return dp[n][target];
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.findTargetSumWays(new int[] {1,1,1,1,1}, 3));
    }
}
