package com.kurumi.codeThoughts.动态规划._05_子序列问题._02_连续子序列;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 674. 最长连续递增序列
 */
public class LeetCode_0674 {
    static class Solution {
        public int findLengthOfLCIS(int[] nums) {
            int[] dp = new int[nums.length];
            Arrays.fill(dp, 1);
            int res = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i - 1])
                    dp[i] = dp[i - 1] + 1;
                res = res > dp[i] ? res : dp[i];
            }
            return res;
        }
    }
}
