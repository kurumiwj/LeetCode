package com.kurumi.leetCode.basicPractice.二分;

/**
 * @Author kurumi
 * @Date 2026-07-03 下午2:12:18
 * @Description 34. 在排序数组中查找元素的第一个和最后一个位置
 */
public class LeetCode_0034 {
    static class Solution {
        private int binarySearch(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] < target) left = mid + 1;
                else right = mid - 1;
            }
            return left;
        }

        public int[] searchRange(int[] nums, int target) {
            int start = binarySearch(nums, target);
            if (start == nums.length || nums[start] != target) return new int[] {-1, -1};
            int end = binarySearch(nums, target + 1) - 1;
            return new int[] {start, end};
        }
    }
}
