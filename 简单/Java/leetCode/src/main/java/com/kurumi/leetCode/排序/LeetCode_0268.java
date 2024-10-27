package com.kurumi.leetCode.排序;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024年10月26日 下午11:50:23
 * @Description 268. 丢失的数字
 */
public class LeetCode_0268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; ++i) {
            if (i != nums[i]) return i;
        }
        return nums.length;
    }
}
