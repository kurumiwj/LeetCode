package com.kurumi.leetCode.二分;

/**
 * @Author kurumi
 * @Date 2026-07-03 下午5:29:14
 * @Description 162. 寻找峰值
 */
public class LeetCode_0162 {
    static class Solution {
        public int findPeakElement(int[] nums) {
            if (nums.length == 1) return 0;
            int left = 0, right = nums.length - 2;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] > nums[mid + 1]) right = mid - 1;
                else left = mid + 1;
            }
            return left;
        }
    }
}
