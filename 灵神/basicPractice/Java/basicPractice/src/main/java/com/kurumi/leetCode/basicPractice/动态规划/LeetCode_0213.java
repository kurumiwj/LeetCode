package com.kurumi.leetCode.basicPractice.动态规划;

/**
 * @Author kurumi
 * @Date 2026-07-08 下午11:53:57
 * @Description 213. 打家劫舍 II
 */
public class LeetCode_0213 {
    static class Solution {
        private int rob0(int[] nums, int start, int end) {
            int n = nums.length;
            int[] dp = new int[n];
            dp[start] = nums[start];
            dp[start + 1] = Math.max(nums[start], nums[start + 1]);
            for (int i = start + 2; i < end; i++) dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
            return dp[end - 1];
        }

        public int rob(int[] nums) {
            if (nums.length == 1) return nums[0];
            if (nums.length == 2) return Math.max(nums[0], nums[1]);
            return Math.max(rob0(nums, 0, nums.length - 1), rob0(nums, 1, nums.length));
        }
    }

    static class Solution1 {
        private int rob0(int[] nums, int start, int end) {
            int n = nums.length, d0 = nums[start], d1 = Math.max(nums[start], nums[start + 1]);
            for (int i = start + 2; i < end; i++) {
                int preD1 = d1;
                d1 = Math.max(d1, d0 + nums[i]);
                d0 = preD1;
            }
            return d1;
        }

        public int rob(int[] nums) {
            if (nums.length == 1) return nums[0];
            if (nums.length == 2) return Math.max(nums[0], nums[1]);
            return Math.max(rob0(nums, 0, nums.length - 1), rob0(nums, 1, nums.length));
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.rob(new int[] {2,3,2}));
        System.out.println(solution.rob(new int[] {1,2,3,1}));
        System.out.println(solution.rob(new int[] {1,2,3}));
        System.out.println(solution.rob(new int[] {0,0}));
    }
}
