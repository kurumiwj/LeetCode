package com.kurumi.leetCode.scientificPractice.基础入门;

/**
 * @Author kurumi
 * @Date 2026-07-09 下午11:05:21
 * @Description 2413. 最小偶倍数
 */
public class LeetCode_2413 {
    static class Solution {
        public int smallestEvenMultiple(int n) {
            return n % 2 == 0 ? n : n * 2;
        }
    }
}
