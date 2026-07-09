package com.kurumi.leetCode.medium.滑动窗口;

/**
 * @Author kurumi
 * @Date 2026-07-03 下午1:44:42
 * @Description
 */
public class LeetCode_0209 {
    static class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int n = nums.length, left = 0, sum = 0, res = Integer.MAX_VALUE;
            for (int right = left; right < n; right++) {
                sum += nums[right];
//                while (sum - nums[left] >= target) {
//                    sum -= nums[left];
//                    ++left;
//                }
//                if (sum >= target) res = Math.min(res, right - left + 1);
                while (sum >= target) {
                    res = Math.min(res, right - left + 1);
                    sum -= nums[left++];
                }
            }
            return res == Integer.MAX_VALUE ? 0 : res;
        }
    }
}
