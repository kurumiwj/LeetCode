package com.kurumi.codeThoughts.贪心._02_中等;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 376. 摆动序列
 */
public class LeetCode_0376 {
    static class Solution {
        public int wiggleMaxLength(int[] nums) {
            if (nums.length <= 1)
                return nums.length;
            int pre = 0;
            int cur = 0;
            int res = 1;
            for (int i = 1; i < nums.length; i++) {
                cur = nums[i] - nums[i - 1];
                if (pre <= 0 && cur > 0 || pre >= 0 && cur < 0) {
                    res++;
                    pre = cur;
                }
            }
            return res;
        }
    }
}
