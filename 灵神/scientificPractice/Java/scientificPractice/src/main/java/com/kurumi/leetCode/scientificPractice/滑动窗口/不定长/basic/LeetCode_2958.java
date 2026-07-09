package com.kurumi.leetCode.scientificPractice.滑动窗口.不定长.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author kurumi
 * @Date 2026-06-24 下午9:13:05
 * @Description 2958. 最多 K 个重复元素的最长子数组
 */
public class LeetCode_2958 {
    private static int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length, left = 0, res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int right = left; right < n; ++right) {
            int val = nums[right];
            while (map.getOrDefault(val, 0) >= k) {
                map.merge(nums[left], -1, Integer::sum);
                ++left;
            }
            map.merge(val, 1, Integer::sum);
            res = Math.max(res, right - left + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxSubarrayLength(new int[] {1,2,3,1,2,3,1,2}, 2));
        System.out.println(maxSubarrayLength(new int[] {1,2,1,2,1,2,1,2}, 1));
        System.out.println(maxSubarrayLength(new int[] {5,5,5,5,5,5,5}, 4));
    }
}
