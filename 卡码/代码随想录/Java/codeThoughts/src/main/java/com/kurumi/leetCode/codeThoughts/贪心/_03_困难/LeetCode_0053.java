package com.kurumi.leetCode.codeThoughts.贪心._03_困难;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 53. 最大子数组和
 */
public class LeetCode_0053 {
    static class Solution {
        public int maxSubArray(int[] nums) {
            int result = Integer.MIN_VALUE;
            int cnt = 0;
            for (int num : nums) {
                cnt += num;
                if (cnt > result)
                    result = cnt;
                if (cnt <= 0)
                    cnt = 0;
            }
            return result;
        }
    }
}
