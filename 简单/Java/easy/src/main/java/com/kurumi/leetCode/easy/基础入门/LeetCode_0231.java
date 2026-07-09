package com.kurumi.leetCode.easy.基础入门;

/**
 * @Author kurumi
 * @Date 2026-07-09 下午11:40:48
 * @Description 231. 2 的幂
 */
public class LeetCode_0231 {
    static class Solution {
        public boolean isPowerOfTwo(int n) {
            return n > 0 && (n & (n - 1)) == 0;
        }
    }
}
