package com.kurumi.leetCode.哈希;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author kurumi
 * @Date 2024年11月19日 上午12:01:02
 * @Description 219. 存在重复元素 II
 */
public class LeetCode_0219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (hash.containsKey(nums[i]) && Math.abs(i - hash.get(nums[i])) <= k) {
                return true;
            }
            hash.put(nums[i], i);
        }
        return false;
    }
}
