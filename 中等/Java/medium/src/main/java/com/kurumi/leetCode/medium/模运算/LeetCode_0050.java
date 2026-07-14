package com.kurumi.leetCode.medium.模运算;

/**
 * @Author kurumi
 * @Date 2026-07-09 15:40:18
 * @Description 50. Pow(x, n)
 **/
public class LeetCode_0050 {
    static class Solution {
        public double myPow(double x, int n) {
            double res = 1;
            long N = n;
            if (N < 0) {
                x = 1 / x;
                N = -N;
            }
            while (N != 0) {
                if ((N & 1) == 1) res *= x;
                x *= x;
                N >>= 1;
            }
            return res;
        }
    }
}
