package com.kurumi.leetCode.top100.双指针;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午5:49:07
 * @Description 11. 盛最多水的容器
 */
public class LeetCode_0011 {
    static class Solution {
        public int maxArea(int[] height) {
            int left = 0, right = height.length - 1;
            int res = 0;
            while (left < right) {
                if (height[left] < height[right]) {
                    res = Math.max(res, (right - left) * height[left]);
                    ++left;
                }
                else {
                    res = Math.max(res, (right - left) * height[right]);
                    --right;
                }
            }
            return res;
        }
    }
}
