package com.kurumi.leetCode.排序;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024年10月28日 下午11:42:21
 * @Description 414. 第三大的数
 */
public class LeetCode_0414 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int res = nums[nums.length-1], index = 1;
        for (int i = nums.length-2; i >= 0; --i) {
            if (nums[i] != nums[i+1]) {
                ++index;
            }
            if (index == 3) res = nums[i];
        }
        return res;
    }
}
