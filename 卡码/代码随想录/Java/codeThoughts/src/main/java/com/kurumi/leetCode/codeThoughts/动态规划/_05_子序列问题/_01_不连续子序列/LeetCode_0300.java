package com.kurumi.leetCode.codeThoughts.动态规划._05_子序列问题._01_不连续子序列;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 300. 最长递增子序列
 */
public class LeetCode_0300 {
    static class Solution {
        public int lengthOfLIS(int[] nums) {
            int[] dp = new int[nums.length];
            Arrays.fill(dp, 1);
            int res = 1;
            for (int i = 1; i < nums.length; i++) {
                for (int j = 0; j < i; j++)
                    if (nums[i] > nums[j])
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                res = res > dp[i] ? res : dp[i];
            }
            return res;
        }
    }
}
