package com.kurumi.leetCode.排序;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024年10月24日 下午11:53:53
 * @Description 88. 合并两个有序数组
 */
public class LeetCode_0088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; ++i) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
