package com.kurumi.leetCode.codeThoughts.动态规划._05_子序列问题._02_连续子序列;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 53. 最大子数组和
 */
public class LeetCode_0053 {
    static class Solution {
        public int maxSubArray(int[] nums) {
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            int res = nums[0];
            for (int i = 1; i < nums.length; i++) {
                dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
                res = dp[i] > res ? dp[i] : res;
            }
            return res;
        }
    }
}
