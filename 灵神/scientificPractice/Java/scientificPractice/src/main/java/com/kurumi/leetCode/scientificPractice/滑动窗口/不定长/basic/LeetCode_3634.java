package com.kurumi.leetCode.scientificPractice.滑动窗口.不定长.basic;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-06-23 下午9:21:02
 * @Description 3634. 使数组平衡的最少移除数目
 */
public class LeetCode_3634 {
    private static int minRemoval(int[] nums, int k) {
        int n = nums.length;
        if (n == 1) return 0;
        Arrays.sort(nums);
        int res = 0, left = 0;
        for (int right = 0; right < n; ++right) {
            while (nums[right] > k * (long) nums[left]) ++left;
            res = Math.max(res, right - left + 1);
        }
        return n - res;
    }

    public static void main(String[] args) {
        System.out.println(minRemoval(new int[] {2,1,5}, 2));
        System.out.println(minRemoval(new int[] {1,6,2,9}, 3));
        System.out.println(minRemoval(new int[] {4,6}, 2));
    }
}
