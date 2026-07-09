package com.kurumi.leetCode.scientificPractice.基础入门;

/**
 * @Author kurumi
 * @Date 2026-07-09 下午11:17:07
 * @Description 1512. 好数对的数目
 */
public class LeetCode_1512 {
    static class Solution {
        public int numIdenticalPairs(int[] nums) {
            int cnt = 0;
            for (int j = 1; j < nums.length; j++) {
                for (int i = 0; i < j; i++) {
                    if (nums[i] == nums[j]) ++cnt;
                }
            }
            return cnt;
        }
    }
}
