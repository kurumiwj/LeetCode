package com.kurumi.leetCode.哈希;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author kurumi
 * @Date 2024年11月18日 下午11:58:43
 * @Description 217. 存在重复元素
 */
public class LeetCode_0217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> hash = new HashMap<>();
        for (int num : nums) {
            if (hash.containsKey(num)) return true;
            hash.put(num, true);
        }
        return false;
    }
}
