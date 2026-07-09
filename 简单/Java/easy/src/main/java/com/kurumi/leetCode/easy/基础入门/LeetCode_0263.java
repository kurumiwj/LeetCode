package com.kurumi.leetCode.easy.基础入门;

/**
 * @Author kurumi
 * @Date 2026-07-09 下午11:51:18
 * @Description 263. 丑数
 */
public class LeetCode_0263 {
    static class Solution {
        public boolean isUgly(int n) {
            if (n == 0) return false;
            while (n % 5 == 0) n /= 5;
            while (n % 3 == 0) n /= 3;
            while (n % 2 == 0) n /= 2;
            return n == 1;
        }
    }
}
