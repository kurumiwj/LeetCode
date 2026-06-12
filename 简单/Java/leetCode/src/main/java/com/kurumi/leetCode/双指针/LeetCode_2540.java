package com.kurumi.leetCode.双指针;

/**
 * @Author Administrator
 * @Date 2026年6月12日 22:38:28
 * @Description 2540. 最小公共值
 */
public class LeetCode_2540 {
    private static int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) ++i;
            else if (nums1[i] > nums2[j]) ++j;
            else return nums1[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getCommon(new int[]{1, 2, 3}, new int[]{2, 4}));
        System.out.println(getCommon(new int[]{1, 2, 3, 6}, new int[]{2, 3, 4, 5}));
    }
}
