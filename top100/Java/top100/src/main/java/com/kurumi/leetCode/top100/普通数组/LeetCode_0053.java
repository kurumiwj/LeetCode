package com.kurumi.leetCode.top100.普通数组;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午5:53:29
 * @Description 53. 最大子数组和
 */
public class LeetCode_0053 {
    static class Solution {
        public int maxSubArray(int[] nums) {
            int cur = nums[0], res = nums[0];
            for (int i = 1; i < nums.length; i++) {
                cur = Math.max(cur + nums[i], nums[i]);
                res = Math.max(res, cur);
            }
            return res;
        }
    }
}
