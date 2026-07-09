package com.kurumi.leetCode.codeThoughts.动态规划._05_子序列问题._02_连续子序列;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 718. 最长重复子数组
 */
public class LeetCode_0718 {
    static class Solution {
        public int findLength(int[] nums1, int[] nums2) {
            int[][] dp = new int[nums1.length + 1][nums2.length + 1];
            int res = 0;
            for (int i = 1; i <= nums1.length; i++) {
                for (int j = 1; j <= nums2.length; j++) {
                    if (nums1[i - 1] == nums2[j - 1])
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    res = dp[i][j] > res ? dp[i][j] : res;
                }
            }
            return res;
        }
    }
}
