package com.kurumi.leetCode.medium.动态规划;

/**
 * @Author kurumi
 * @Date 2026-07-06 上午10:24:57
 * @Description 198. 打家劫舍
 */
public class LeetCode_0198 {
    static class Solution {
        public int rob(int[] nums) {
            int n = nums.length;
            if (n == 1) return nums[0];
            int[] dp = new int[n];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < n; i++) {
                dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
            }
            return dp[n - 1];
        }
    }

    static class Solution1 {
        public int rob(int[] nums) {
            int n = nums.length;
            if (n == 1) return nums[0];
            int d0 = nums[0], d1 = Math.max(d0, nums[1]);
            for (int i = 2; i < n; i++) {
                int tmp = Math.max(nums[i] + d0, d1);
                d0 = d1;
                d1 = tmp;
            }
            return d1;
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.rob(new int[] {1, 2, 3, 1}));
        System.out.println(solution.rob(new int[] {2, 7, 9, 3, 1}));
    }
}
