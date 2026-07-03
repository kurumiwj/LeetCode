package com.kurumi.scientificPractice.滑动窗口.定长.other;

/**
 * @Author kurumi
 * @Date 2026-06-25 下午1:30:16
 * @Description 1016. 子串能表示从 1 到 N 数字的二进制串
 */
public class LeetCode_1016 {
    public boolean queryString(String s, int n) {
        for (int i = 1; i <= n; i++) {
            String binStr = Integer.toBinaryString(i);
            if (!s.contains(binStr)) return false;
        }
        return true;
    }
}
