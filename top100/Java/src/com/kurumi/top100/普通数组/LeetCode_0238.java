package com.kurumi.top100.普通数组;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午5:55:31
 * @Description 238. 除了自身以外数组的乘积
 */
public class LeetCode_0238 {
    static class Solution {
        public int[] productExceptSelf(int[] nums) {
            int prod = 1, zeroCount = 0;
            for (int num : nums) {
                if (num == 0) {
                    ++zeroCount;
                    continue;
                }
                prod *= num;
            }
            int[] res = new int[nums.length];
            if (zeroCount > 1) return res;
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] == 0) res[i] = prod;
                else {
                    if (zeroCount == 0) res[i] = prod / nums[i];
                }
            }
            return res;
        }
    }
}
