package com.kurumi.leetCode.二分;

/**
 * @Author kurumi
 * @Date 2026-07-03 下午5:41:17
 * @Description 153. 寻找旋转排序数组中的最小值
 */
public class LeetCode_0153 {
    static class Solution {
        public int findMin(int[] nums) {
            int left = 0, right = nums.length - 2;
            while (left <= right) {
                int mid = left +(right - left) / 2;
                if (nums[mid] > nums[nums.length - 1]) left = mid + 1;
                else right = mid - 1;
            }
            return nums[left];
        }
    }
}
