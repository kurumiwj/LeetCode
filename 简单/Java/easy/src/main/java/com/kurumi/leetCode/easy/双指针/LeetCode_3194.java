package com.kurumi.leetCode.easy.双指针;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-06-13 下午4:28:40
 * @Description 3194. 最小元素和最大元素的最小平均值
 */
public class LeetCode_3194 {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        double minAvg = (nums[i++] + nums[j--]) * 1.0 / 2;
        while (i < j) {
            minAvg = Math.min(minAvg, (nums[i++] + nums[j--]) * 1.0 / 2);
        }
        return minAvg;
    }
}
