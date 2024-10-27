package com.kurumi.leetCode.排序;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024年10月26日 下午11:53:08
 * @Description 349. 两个数组的交集
 */
public class LeetCode_0349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        int[] res = new int[nums1.length];
        int index = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                ++i;
            } else if (nums1[i] > nums2[j]) {
                ++j;
            } else {
                if (index == 0 || nums1[i] != res[index-1]) {
                    res[index] = nums1[i];
                    ++index;
                }
                ++i;
                ++j;
            }
        }
        return Arrays.copyOfRange(res, 0, index);
    }
}
