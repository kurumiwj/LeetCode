package com.kurumi.leetCode.二分查找;

/**
 * @Author kurumi
 * @Date 2026-06-21 下午7:52:13
 * @Description 2540. 最小公共值
 */
public class LeetCode_2540 {
    private static int binarySearch(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) i = mid + 1;
            else j = mid - 1;
        }
        return -1;
    }

    private static int getCommon(int[] nums1, int[] nums2) {
        for (int num : nums2) {
            int index = binarySearch(nums1, num);
            if (index != -1) return num;
        }
        return -1;
    }
}
