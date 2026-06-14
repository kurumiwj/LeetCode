package com.kurumi.leetCode.二分查找;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-06-14 下午9:55:36
 * @Description 1608. 特殊数组的特征值
 */
public class LeetCode_1608 {
    private static int specialArray(int[] nums) {
        Arrays.sort(nums);
        int maxNum = -1;
        for (int x = 1; x <= nums.length; ++x) {
            int i = 0, j = nums.length - 1;
            while (i <= j) {
                int mid = (i + j) / 2;
                if (nums[mid] >= x) j = mid - 1;
                else i = mid + 1;
            }
            if (nums.length - i == x) maxNum = Math.max(maxNum, x);
        }
        return maxNum;
    }

    public static void main(String[] args) {
        System.out.println(specialArray(new int[] {3, 5}));
        System.out.println(specialArray(new int[] {0,4,3,0,4}));
    }
}
