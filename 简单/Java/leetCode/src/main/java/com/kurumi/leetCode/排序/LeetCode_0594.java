package com.kurumi.leetCode.排序;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024-10-31 上午12:29:14
 * @Description 594. 最长和谐子序列
 */
public class LeetCode_0594 {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int start = 0;
        for (int end = 0; end < nums.length; ++end) {
            while (nums[end] - nums[start] > 1) {
                ++start;
            } 
            if (nums[end] - nums[start] == 1) {
                res = Math.max(res, end - start + 1);
            }
        }
        return res;
    }
}
