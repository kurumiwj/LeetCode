package com.kurumi.leetCode.二分查找;

import java.util.Arrays;

/**
 * @Author Administrator
 * @Date 2026年6月13日 20:29:56
 * @Description 268. 丢失的数字
 */
public class LeetCode_0268 {
    private static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid == nums[mid]) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }

    private static int missingNumber2(int[] nums) {
        int n = nums.length, sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return n * (n + 1) / 2 - sum;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber2(new int[]{3, 0, 1}));
        System.out.println(missingNumber2(new int[]{0, 1}));
        System.out.println(missingNumber2(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
}
