package com.kurumi.scientificPractice.slideWindow.fixedLength.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author kurumi
 * @Date 2026-06-22 下午10:06:02
 * @Description 2461. 长度为 K 子数组中的最大和
 */
public class LeetCode_2461 {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long sum = 0, res = 0;
        int left = 0, right = 0;
        while (right < k - 1) {
            int val = nums[right];
            sum += val;
            if (map.containsKey(val)) map.put(val, map.get(val) + 1);
            else map.put(val, 1);
            ++right;
        }
        while (right < nums.length) {
            int rightVal = nums[right], leftVal = nums[left];
            sum += rightVal;
            if (map.containsKey(rightVal)) map.put(rightVal, map.get(rightVal) + 1);
            else map.put(rightVal, 1);
            if (map.size() == k) res = Math.max(res, sum);
            sum -= leftVal;
            if (map.get(leftVal) == 1) map.remove(leftVal);
            else map.put(leftVal, map.get(leftVal) - 1);
            ++right;
            ++left;
        }
        return res;
    }
}
