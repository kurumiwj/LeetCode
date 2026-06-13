package com.kurumi.leetCode.二分查找;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-06-13 下午11:34:31
 * @Description 350. 两个数组的交集 II
 */
public class LeetCode_0350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = nums1.length - 1, index = 0;
        int[] res = new int[nums1.length];
        while (i < j) {
            int mid = (i + j) / 2;
            if (nums1[mid] >= nums2[0]) j = mid - 1;
            else if (nums1[mid] < nums2[0]) i = mid + 1;
        }
        j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                res[index++] = nums1[i];
                ++i;
                ++j;
            } else if (nums1[i] > nums2[j]) ++j;
            else ++i;
        }
        return Arrays.copyOfRange(res, 0, index);
    }
}
