package com.kurumi.leetCode.scientificPractice.模运算;

/**
 * @Author kurumi
 * @Date 2026年7月14日 17:55:24
 * @Description 3463. 判断操作后字符串中的数字是否相等 II
 */
public class LeetCode_3463 {
    static class Solution {
        private static final int MAX = 5;
        private static final int [][] c = new int[MAX][MAX];

        static {
            for (int i = 0; i < MAX; i++) {
                c[i][0] = c[i][i] = 1;
                for (int j = 1; j < i; j++) c[i][j] = c[i - 1][j - 1] + c[i - 1][j];
            }
        }

        private int lucas(int n, int k, int p) {
            if (k == 0) return 1;
            return c[n % p][k % p] * lucas(n / p, k / p, p) % p;
        }

        private int comb(int n, int k) {
            return lucas(n, k, 2) * 5 + lucas(n, k, 5) * 6;
        }

        public boolean hasSameDigits(String s) {
            char[] chs = s.toCharArray();
            int diff = 0;
            for (int i = 0; i < chs.length - 1; i++) diff += comb(chs.length - 2, i) * (chs[i] - chs[i + 1]);
            return diff % 10 == 0;
        }
    }
}
