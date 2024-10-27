package com.kurumi.leetCode.排序;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024年10月27日 上午12:06:02
 * @Description 350. 两个数组的交集 II
 */
public class LeetCode_0350 {
    public int[] intersect(int[] nums1, int[] nums2) {
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
                res[index] = nums1[i];
                ++index;
                ++i;
                ++j;
            }
        }
        return Arrays.copyOfRange(res, 0, index);
    }
}
