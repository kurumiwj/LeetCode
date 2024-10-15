// 35. 搜索插入位置
package com.kurumi.leetCode.数组;

/**
 * @author: kurumi
 * @date: 2024-10-16 22:07:14
 */
public class LeetCode_0035 {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }
}
