package com.kurumi.leetCode.easy.二分查找;

/**
 * @Author kurumi
 * @Date 2026-06-13 下午11:35:24
 * @Description 367. 有效的完全平方数
 */
public class LeetCode_0367 {
    private static boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        long i = 1, j = num;
        while (i < j) {
            long mid = ((i + j) / 2);
            if (mid * mid == num) return true;
            else if (mid * mid > num) j = mid - 1;
            else i = mid + 1;
        }
        return i * i == num;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147483647));
    }
}
