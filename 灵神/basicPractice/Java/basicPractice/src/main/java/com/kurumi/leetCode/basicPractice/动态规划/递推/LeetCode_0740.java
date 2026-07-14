package com.kurumi.leetCode.basicPractice.动态规划.递推;

/**
 * @Author kurumi
 * @Date 2026-07-09 上午12:25:41
 * @Description 740. 删除并获得点数
 */
public class LeetCode_0740 {
    static class Solution {
        private int process(int[] nums) {
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < nums.length; i++) dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
            return dp[nums.length - 1];
        }

        public int deleteAndEarn(int[] nums) {
            int n = nums.length;
            if (n == 1) return nums[0];
            int max = 0;
            for (int num : nums) max = Math.max(num, max);
            int[] cnt = new int[max + 1];
            for (int num : nums) cnt[num] += num;
            return process(cnt);
        }
    }

    static class Solution1 {
        private int process(int[] nums) {
            int d0 = nums[0], d1 = Math.max(nums[0], nums[1]);
            for (int i = 2; i < nums.length; i++) {
                int preD1 = d1;
                d1 = Math.max(d1, d0 + nums[i]);
                d0 = preD1;
            }
            return d1;
        }

        public int deleteAndEarn(int[] nums) {
            int n = nums.length;
            if (n == 1) return nums[0];
            int max = 0;
            for (int num : nums) max = Math.max(num, max);
            int[] cnt = new int[max + 1];
            for (int num : nums) cnt[num] += num;
            return process(cnt);
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.deleteAndEarn(new int[] {3,4,2}));
        System.out.println(solution.deleteAndEarn(new int[] {2,2,3,3,3,4}));
    }
}
