package com.kurumi.basicPractice.双指针;

/**
 * @Author kurumi
 * @Date 2026-07-03 下午1:32:29
 * @Description 42. 接雨水
 */
public class LeetCode_0042 {
    static class Solution {
        public int trap(int[] height) {
            int n = height.length, res = 0;
            int[] preMax = new int[n], sufMax = new int[n];
            preMax[0] = height[0];
            for (int i = 1; i < n; i++) preMax[i] = Math.max(preMax[i - 1], height[i]);
            sufMax[n - 1] = height[n - 1];
            for (int i = n - 2; i >= 0; i--) sufMax[i] = Math.max(sufMax[i + 1], height[i]);
            for (int i = 0; i < n; i++) {
                res += Math.min(preMax[i], sufMax[i]) - height[i];
            }
            return res;
        }
    }

    static class Solution1 {
        public int trap(int[] height) {
            int n = height.length, res = 0, left = 0, right = n - 1, preMax = 0, sufMax = 0;
            while (left <= right) {
                preMax = Math.max(preMax, height[left]);
                sufMax = Math.max(sufMax, height[right]);
                if (preMax < sufMax) res += preMax - height[left++];
                else res += sufMax - height[right--];
            }
            return res;
        }
    }
}
