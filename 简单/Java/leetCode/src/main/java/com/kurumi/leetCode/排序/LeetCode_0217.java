package com.kurumi.leetCode.排序;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024年10月25日 上午12:11:35
 * @Description 217. 存在重复元素
 */
public class LeetCode_0217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == nums[i-1]) return true;
        }
        return false;
    }
}
