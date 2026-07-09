package com.kurumi.leetCode.medium.二分;

/**
 * @Author kurumi
 * @Date 2026-07-03 下午6:01:07
 * @Description 33. 搜索旋转排序数组
 */
public class LeetCode_0033 {
    static class Solution {
        // 判断target是否在mid位置的左边
        private boolean checkLeft(int[] nums, int target, int mid) {
            int end = nums[nums.length - 1], x = nums[mid];
            if (x > end) return target > end && target <= x;
            return target > end || target <= x;
        }

        public int search(int[] nums, int target) {
            int left = 0, right = nums.length - 2;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (checkLeft(nums, target, mid)) right = mid - 1;
                else left = mid + 1;
            }
            return nums[left] == target ? left :-1;
        }
    }
}
