package com.kurumi.leetCode.排序;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024年11月3日 上午10:41:06
 * @Description 645. 错误的集合
 */
public class LeetCode_0645 {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[2];
        int prev = 0, n = nums.length;
        for (int i = 0; i < n; ++i) {
            int cur = nums[i];
            if (cur == prev) {  // 两个相邻数重复则错误数即为该数
                res[0] = cur;
            } else if (cur - prev > 1) {    // 若两个相邻数差值大于1, 则正确的数即为两者之间的数
                res[1] = cur - 1;
            }
            prev = cur;
        }
        if (nums[n-1] != n) res[1] = n;
        return res;
    }
}
