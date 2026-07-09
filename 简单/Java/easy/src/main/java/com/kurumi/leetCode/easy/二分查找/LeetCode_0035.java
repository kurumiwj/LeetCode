package com.kurumi.leetCode.easy.二分查找;

/**
 * @Author Administrator
 * @Date 2026年6月13日 19:13:08
 * @Description 35. 搜索插入位置
 */
public class LeetCode_0035 {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
