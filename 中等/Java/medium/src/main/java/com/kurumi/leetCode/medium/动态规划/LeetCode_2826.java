package com.kurumi.leetCode.medium.动态规划;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-21 下午5:29:47
 * @Description 2826. 将三个组排序
 */
public class LeetCode_2826 {
    static class Solution {
        public int minimumOperations(List<Integer> nums) {
            int n = nums.size(), res = 0;
            int[] dp = new int[n + 1];
            Arrays.fill(dp, 1);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (nums.get(i) >= nums.get(j)) dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                res = Math.max(res, dp[i]);
            }
            return n - res;
        }
    }

    // 递归
    static class Solution1 {
        private int[] cache;

        private int dfs(List<Integer> nums, int i) {
            if (cache[i] > 0) return cache[i];
            int res = 0;
            for (int j = 0; j < i; j++) {
                if (nums.get(i) >= nums.get(j)) {
                    res = Math.max(dfs(nums, j), res);
                }
            }
            ++res;
            return cache[i] = res;
        }

        public int minimumOperations(List<Integer> nums) {
            int n = nums.size(), res = 0;
            cache = new int[n + 1];
            for (int i = 0; i < n; i++) {
                res = Math.max(res, dfs(nums, i));
            }
            return n - res;
        }
    }

    // 二分
    static class Solution2 {
        private int lowerBound(List<Integer> g, int target) {
            int left = 0, right = g.size() - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (g.get(mid) <= target) left = mid + 1;
                else right = mid - 1;
            }
            return left;
        }

        public int minimumOperations(List<Integer> nums) {
            List<Integer> g = new ArrayList<>();
            for (int num : nums) {
                int pos = lowerBound(g, num);
                if (pos == g.size()) g.add(num);
                else g.set(pos, num);
            }
            return nums.size() - g.size();
        }
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.minimumOperations(Arrays.asList(2,1,3,2,1)));
        System.out.println(solution.minimumOperations(Arrays.asList(1,3,2,1,3,3)));
    }
}
