package com.kurumi.leetCode.scientificPractice.基础入门;

/**
 * @Author kurumi
 * @Date 2026-07-09 下午11:15:10
 * @Description 1486. 数组异或操作
 */
public class LeetCode_1486 {
    static class Solution {
        public int xorOperation(int n, int start) {
            int res = start;
            for (int i = 1; i < n; i++) {
                res ^= (start + 2 * i);
            }
            return res;
        }
    }
}
