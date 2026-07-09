package com.kurumi.leetCode.scientificPractice.基础入门;

/**
 * @Author kurumi
 * @Date 2026-07-09 下午11:35:00
 * @Description 258. 各位相加
 */
public class LeetCode_0258 {
    static class Solution {
        public int addDigits(int num) {
            int res = 0;
            while (num > 0) {
                res += num % 10;
                if (res >= 10) res = res % 10 + res / 10;
                num /= 10;
            }
            return res;
        }
    }

    static class Solution1 {
        public int addDigits(int num) {
            return (num - 1) % 9 + 1;
        }
    }
}
