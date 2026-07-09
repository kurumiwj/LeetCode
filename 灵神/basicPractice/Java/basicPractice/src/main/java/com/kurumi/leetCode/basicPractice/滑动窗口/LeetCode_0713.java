package com.kurumi.leetCode.basicPractice.滑动窗口;

/**
 * @Author kurumi
 * @Date 2026-07-03 下午1:54:10
 * @Description 713. 乘积小于 K 的子数组
 */
public class LeetCode_0713 {
    static class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            int n = nums.length, res = 0, prod = 1, i = 0;
            for (int j = i; j < n; j++) {
                prod *= nums[j];
                while (prod >= k) {
                    prod /= nums[i++];
                }
                if (prod < k) res += j - i + 1;
            }
            return res;
        }
    }
}
