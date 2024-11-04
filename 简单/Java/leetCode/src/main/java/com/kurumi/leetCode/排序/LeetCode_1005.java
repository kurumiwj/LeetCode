package com.kurumi.leetCode.排序;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024年11月5日 上午12:18:48
 * @Description 1005. K 次取反后最大化的数组和
 */
public class LeetCode_1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        nums = Arrays.stream(nums).boxed().sorted((a, b) -> Math.abs(a) - Math.abs(b)).mapToInt(Integer::intValue).toArray();
        for (int i = nums.length - 1; i >= 0; --i) {
            if (nums[i] < 0 && k > 0) {
                nums[i] = -nums[i];
                --k;
            }
            if (k == 0) break;
        }
        if ((k & 1) == 1) nums[0] = -nums[0];
        return Arrays.stream(nums).sum();
    }
}
