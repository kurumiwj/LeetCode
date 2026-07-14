package com.kurumi.leetCode.scientificPractice.模运算;

/**
 * @Author kurumi
 * @Date 2026年7月14日 10:27:21
 * @Description 3379. 转换数组
 */
public class LeetCode_3379 {
    static class Solution {
        public int[] constructTransformedArray(int[] nums) {
            int n = nums.length;
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                int step = Math.abs(nums[i]);
                res[i] = nums[i] < 0 ? nums[(i + (step / n + 1) * n - step) % n] : nums[(i + step) % n];
            }
            return res;
        }
    }

    static class Solution1 {
        public int[] constructTransformedArray(int[] nums) {
            int n = nums.length;
            int[] res = new int[n];
            for (int i = 0; i < n; i++) res[i] = nums[((i + nums[i]) % n + n) % n];
            return res;
        }
    }
}
