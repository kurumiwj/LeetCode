package com.kurumi.leetCode.medium.动态规划;

import java.util.Arrays;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026年7月10日 13:10:19
 * @Description 2915. 和为目标值的最长子序列的长度
 */
public class LeetCode_2915 {
    static class Solution {
        public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
            int n = nums.size();
            int[][] dp = new int[n + 1][target + 1];
            Arrays.fill(dp[0], Integer.MIN_VALUE);
            dp[0][0] = 0;
            for (int i = 0; i < n; i++) {
                int num = nums.get(i);
                for (int j = 0; j <= target; j++) {
                    if (j < num) dp[i + 1][j] = dp[i][j];
                    else dp[i + 1][j] = Math.max(dp[i][j - num] + 1, dp[i][j]);
                }
            }
            return dp[n][target] > 0 ? dp[n][target] : -1;
        }
    }

    static class Solution1 {
        public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
            int[] dp = new int[target + 1];
            Arrays.fill(dp, Integer.MIN_VALUE);
            dp[0] = 0;
            for (int num : nums) {
                for (int j = target; j >= num; j--) dp[j] = Math.max(dp[j - num] + 1, dp[j]);
            }
            return dp[target] > 0 ? dp[target] : -1;
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.lengthOfLongestSubsequence(Arrays.asList(1,1,5,4,5), 3));
    }
}
