package com.kurumi.leetCode.basicPractice.动态规划.线性DP2;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-07-06 下午5:06:18
 * @Description 300. 最长递增子序列
 */
public class LeetCode_0300 {
    static class Solution {
        public int lengthOfLIS(int[] nums) {
            int[] dp = new int[nums.length + 1];
            Arrays.fill(dp, 1);
            int res = dp[0];
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                res = Math.max(res, dp[i]);
            }
            return res;
        }
    }

    static class Solution1 {
        public int lengthOfLIS(int[] nums) {
            int[] dp = new int[nums.length + 1];
            int res = dp[0];
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j]) dp[i] = Math.max(dp[i], dp[j]);
                }
                ++dp[i];
                res = Math.max(res, dp[i]);
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.lengthOfLIS(new int[] {10,9,2,5,3,7,101,18}));
        System.out.println(solution.lengthOfLIS(new int[] {0,1,0,3,2,3}));
        System.out.println(solution.lengthOfLIS(new int[] {7,7,7,7,7,7,7}));
        System.out.println(solution.lengthOfLIS(new int[] {4,10,4,3,8,9}));
    }
}
