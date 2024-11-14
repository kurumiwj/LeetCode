package com.kurumi.leetCode.哈希;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author kurumi
 * @Date 2024年11月15日 上午12:03:01
 * @Description 169. 多数元素
 */
public class LeetCode_0169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int num : nums) {
            Integer cnt = hash.getOrDefault(num, 0) + 1;
            if (cnt > nums.length / 2) return num;
            hash.put(num, cnt);
        }
        return -1;
    }
}
