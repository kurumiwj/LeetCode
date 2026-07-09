package com.kurumi.leetCode.easy.二分查找;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-06-13 下午11:33:57
 * @Description 349. 两个数组的交集
 */
public class LeetCode_0349 {
    private static int[] intersection(int[] nums1, int[] nums2) {
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
                if (index == 0 || index > 0 && nums1[i] != res[index-1]) res[index++] = nums1[i];
                ++i;
                ++j;
            } else if (nums1[i] > nums2[j]) ++j;
            else ++i;
        }
        return Arrays.copyOfRange(res, 0, index);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[] {1, 2, 2, 1}, new int[] {2, 2})));
        System.out.println(Arrays.toString(intersection(new int[] {4, 9, 5}, new int[] {9, 4, 9, 8, 4})));
    }
}
