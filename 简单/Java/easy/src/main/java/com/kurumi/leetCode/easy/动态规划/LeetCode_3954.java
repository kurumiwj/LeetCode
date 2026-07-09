package com.kurumi.leetCode.easy.动态规划;

/**
 * @Author kurumi
 * @Date 2026-06-21 下午9:05:12
 * @Description 3954. 区间内的兼容数字之和 I
 */
public class LeetCode_3954 {
    public int sumOfGoodIntegers(int n, int k) {
        int res = 0;
        for (int i = Math.max(n - k, 0); i <= n + k; ++i) {
            if ((n & i) == 0) res += i;
        }
        return res;
    }
}
