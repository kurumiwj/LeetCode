package com.kurumi.leetCode.scientificPractice.基础入门;

/**
 * @Author kurumi
 * @Date 2026-07-09 下午11:38:30
 * @Description 1281. 整数的各位积和之差
 */
public class LeetCode_1281 {
    static class Solution {
        public int subtractProductAndSum(int n) {
            int prod = 1, sum = 0, n1 = n, n2 = n;
            while (n1 > 0) {
                sum += n1 % 10;
                n1 /= 10;
            }
            while (n2 > 1) {
                prod *= n2 % 10;
                n2 /= 10;
            }
            return prod - sum;
        }
    }
}
