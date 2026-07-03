package com.kurumi.codeThoughts.贪心._02_中等;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 738. 单调递增的数字
 */
public class LeetCode_0738 {
    static class Solution {
        public int monotoneIncreasingDigits(int n) {
            char[] nums = String.valueOf(n).toCharArray();
            int start = nums.length;
            for (int i = nums.length - 1; i > 0; i--) {
                if (nums[i - 1] > nums[i]) {
                    nums[i - 1]--;
                    start = i;
                }
            }
            for (int i = start; i < nums.length; i++)
                nums[i] = '9';
            return Integer.parseInt(String.valueOf(nums));
        }
    }
}
