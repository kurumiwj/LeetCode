package com.kurumi.leetCode.easy.二分查找;

/**
 * @Author Administrator
 * @Date 2026年6月13日 19:15:02
 * @Description 69. x 的平方根
 */
public class LeetCode_0069 {
    private static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        long n = 2;
        while (n * n <= x) n *= 2;
        if (n * n == x) return (int) n;
        long i = n / 2;
        while (i * i <= x) ++i;
        return i * i == x ? (int) i : (int) i - 1;
    }

    private static int mySqrt2(int x) {
        int left = 0, right = x, res = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if ((long) mid * mid <= x) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt2(2147395599));
        System.out.println(mySqrt2(2147395600));
    }
}
