package com.kurumi.leetCode.scientificPractice.基础入门;

/**
 * @Author kurumi
 * @Date 2026-07-09 下午11:45:35
 * @Description 326. 3 的幂
 */
public class LeetCode_0326 {
    static class Solution {
        public boolean isPowerOfThree(int n) {
            return n > 0 && Math.pow(3, 19) % n == 0;
        }
    }
}
