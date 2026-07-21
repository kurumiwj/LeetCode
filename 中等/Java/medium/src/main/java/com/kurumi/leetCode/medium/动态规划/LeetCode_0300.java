package com.kurumi.leetCode.medium.动态规划;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    // 递归
    static class Solution2 {
        private int[] cache;

        private int dfs(int[] nums, int i) {
            if (cache[i] > 0) return cache[i];
            int res = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) res = Math.max(res, dfs(nums, j));
            }
            ++res;
            return cache[i] = res;
        }

        public int lengthOfLIS(int[] nums) {
            int n = nums.length, res = 0;
            cache = new int[n];
            for (int i = 0; i < n; i++) {
                res = Math.max(res, dfs(nums, i));
            }
            return res;
        }
    }

    // 二分
    static class Solution3 {
        private int lowerBound(List<Integer> g, int target) {
            int left = 0, right = g.size() - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (g.get(mid) < target) left = mid + 1;
                else right = mid - 1;
            }
            return left;
        }

        public int lengthOfLIS(int[] nums) {
            List<Integer> g = new ArrayList<>();
            for (int num : nums) {
                int j = lowerBound(g, num);
                if (j == g.size()) g.add(num);
                else g.set(j, num);
            }
            return g.size();
        }
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        System.out.println(solution.lengthOfLIS(new int[] {10,9,2,5,3,7,101,18}));
        System.out.println(solution.lengthOfLIS(new int[] {0,1,0,3,2,3}));
        System.out.println(solution.lengthOfLIS(new int[] {7,7,7,7,7,7,7}));
        System.out.println(solution.lengthOfLIS(new int[] {4,10,4,3,8,9}));
    }
}
