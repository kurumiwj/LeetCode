package com.kurumi.leetCode.basicPractice.双指针;

/**
 * @Author kurumi
 * @Date 2026-07-03 下午1:28:02
 * @Description 11. 盛最多水的容器
 */
public class LeetCode_0011 {
    static class Solution {
        public int maxArea(int[] height) {
            int left = 0, right = height.length - 1, res = 0;
            while (left < right) {
                int w = right - left;
                int h = 0;
                if (height[left] < height[right]) {
                    h = height[left];
                    ++left;
                } else {
                    h = height[right];
                    --right;
                }
                res = Math.max(res, w * h);
            }
            return res;
        }
    }
}
