package com.kurumi.leetCode.排序;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024年10月25日 上午12:00:52
 * @Description 169. 多数元素
 */
public class LeetCode_0169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int cnt = 1, n = nums.length, cur = nums[0];
        for (int i = 1; i <= n / 2; ++i) {
            if (nums[i] == cur) {
                ++cnt;
                if (cnt > n / 2) return cur;
            } else {
                cnt = 0;
                cur = nums[i];
            }
        }
        return cur;
    }
}
