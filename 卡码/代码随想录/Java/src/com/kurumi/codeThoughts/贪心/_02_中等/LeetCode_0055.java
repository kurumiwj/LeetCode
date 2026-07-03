package com.kurumi.codeThoughts.贪心._02_中等;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 55. 跳跃游戏
 */
public class LeetCode_0055 {
    static class Solution {
        public boolean canJump(int[] nums) {
            int cover = 0;
            if (nums.length == 1)
                return true;
            for (int i = 0; i <= cover; i++) {
                cover = Integer.max(i + nums[i], cover);
                if (cover >= nums.length - 1)
                    return true;
            }
            return false;
        }
    }
}
