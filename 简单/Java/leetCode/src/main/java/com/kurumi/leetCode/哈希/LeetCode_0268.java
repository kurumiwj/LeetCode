package com.kurumi.leetCode.哈希;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author kurumi
 * @Date 2024年11月19日 上午12:06:52
 * @Description 268. 丢失的数字
 */
public class LeetCode_0268 {
    public int missingNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < nums.length; ++i) {
            if (map.get(i) == null) return i;
        }
        return nums.length;
    }
}
