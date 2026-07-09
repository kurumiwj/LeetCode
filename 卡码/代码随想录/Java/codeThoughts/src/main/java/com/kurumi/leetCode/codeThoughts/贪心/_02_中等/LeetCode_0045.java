package com.kurumi.leetCode.codeThoughts.贪心._02_中等;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 45. 跳跃游戏 II
 */
public class LeetCode_0045 {
    static class Solution {
        public int jump(int[] nums) {
            int cur = 0, next = 0, res = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                next = Math.max(i + nums[i], next);
                if (cur == i) {
                    cur = next;
                    res++;
                }
            }
            return res;
        }
    }
}
