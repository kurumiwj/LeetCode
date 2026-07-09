package com.kurumi.leetCode.top100.子串;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午5:52:49
 * @Description 560. 和为 K 的子数组
 */
public class LeetCode_0560 {
    static class Solution {
        public int subarraySum(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            int sum = 0, res = 0;
            for (int num : nums) {
                map.merge(sum, 1, Integer::sum);
                sum += num;
                res += map.getOrDefault(sum - k, 0);
            }
            return res;
        }
    }
}
