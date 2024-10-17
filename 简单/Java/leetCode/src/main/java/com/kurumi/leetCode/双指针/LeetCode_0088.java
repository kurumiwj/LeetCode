// 88. 合并两个有序数组
package com.kurumi.leetCode.双指针;

/**
 * @author: kurumi
 * @date: 2024-10-16 23:54:31
 */
public class LeetCode_0088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, index = nums1.length -1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[index] = nums1[p1];
                --p1;
            } else {
                nums1[index] = nums2[p2];
                --p2;
            }
            --index;
        }
        while (p1 >= 0) {
            nums1[index] = nums1[p1];
            --index;
            --p1;
        }
        while (p2 >= 0) {
            nums1[index] = nums2[p2];
            --index;
            --p2;
        }
    }
}
