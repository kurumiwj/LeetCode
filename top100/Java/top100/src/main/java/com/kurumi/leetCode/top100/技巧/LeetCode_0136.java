package com.kurumi.leetCode.top100.技巧;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午6:11:34
 * @Description 136. 只出现一次的数字
 */
public class LeetCode_0136 {
    static class Solution {
        public int singleNumber(int[] nums) {
            int res = 0;
            for (int num : nums) res ^= num;
            return res;
        }
    }
}
