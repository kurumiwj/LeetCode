package com.kurumi.leetCode.medium.utils;

/**
 * @Author kurumi
 * @Date 2026年7月14日 17:31:10
 * @Description MathUtils
 */
public class MathUtils {
    public static int qpow(int n, int e) {
        int res = 1;
        while (e > 0) {
            if ((e & 1) == 1) res = res * n;
            n = n * n;
            e >>= 1;
        }
        return res;
    }

    public static int qpow(int n, int e, int mod) {
        long res = 1, m = n % mod;
        while (e > 0) {
            if ((e & 1) == 1) res = res * m % mod;
            m = m * m % mod;
            e >>= 1;
        }
        return (int) res;
    }
}
