package com.kurumi.leetCode.easy.二分查找;

/**
 * @Author kurumi
 * @Date 2026-06-14 下午2:24:01
 * @Description 441. 排列硬币
 */
public class LeetCode_0441 {
    public int arrangeCoins(int n) {
        long i = 1, j = n;
        while (i <= j) {
            long mid = (i + j) / 2;
            long sum = mid * (mid + 1) / 2;
            if (sum == n) return (int) mid;
            else if (sum > n) j = mid - 1;
            else  i = mid + 1;
        }
        return (int) i - 1;
    }
}
