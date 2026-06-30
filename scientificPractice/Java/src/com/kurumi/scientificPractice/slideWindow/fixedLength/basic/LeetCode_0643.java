package com.kurumi.scientificPractice.slideWindow.fixedLength.basic;

/**
 * @Author kurumi
 * @Date 2026-06-21 下午10:38:18
 * @Description 643. 子数组最大平均数 I
 */
public class LeetCode_0643 {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0, right = k - 1, maxSum = 0, curSum = 0;
        for (int i = left; i <= right; ++i) curSum += nums[i];
        maxSum = curSum;
        for (int i = right + 1; i < nums.length; ++i) {
            curSum -= nums[left];
            ++left;
            curSum += nums[i];
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum * 1.0 / k;
    }

    public double findMaxAverage1(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE, curSum = 0;
        for (int i = 0; i < nums.length; ++i) {
            curSum += nums[i];
            if (i < k - 1) continue;
            maxSum = Math.max(maxSum, curSum);
            curSum -= nums[i - k + 1];
        }
        return maxSum * 1.0 / k;
    }
}
