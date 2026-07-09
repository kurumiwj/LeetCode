package com.kurumi.leetCode.top100.哈希;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午5:47:50
 * @Description
 */
public class LeetCode_0128 {
    static class Solution {
        public int longestConsecutive(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) set.add(num);
            int res = 0;
            for (int num : set) {
                if (set.contains(num - 1)) continue;
                int y = num + 1;
                while (set.contains(y)) ++y;
                res = Math.max(res, y - num);
                if (res * 2 >= set.size()) break;
            }
            return res;
        }
    }
}
