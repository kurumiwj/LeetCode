package com.kurumi.leetCode.scientificPractice.基础入门;

/**
 * @Author kurumi
 * @Date 2026-07-10 上午12:12:21
 * @Description 1470. 重新排列数组
 */
public class LeetCode_1470 {
    static class Solution {
        public int[] shuffle(int[] nums, int n) {
            int[] res = new int[nums.length];
            int index = 0;
            for (int i = 0; i < nums.length; i += 2) {
                res[i] = nums[index];
                res[i + 1] = nums[index + n];
                ++index;
            }
            return res;
        }
    }
}
