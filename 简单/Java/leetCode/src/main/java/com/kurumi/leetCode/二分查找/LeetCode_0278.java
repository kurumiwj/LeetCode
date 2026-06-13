package com.kurumi.leetCode.二分查找;

/**
 * @Author Administrator
 * @Date 2026年6月13日 20:39:46
 * @Description 278. 第一个错误的版本
 */
public class LeetCode_0278 {
    private static boolean isBadVersion(int n) {
        return n >= 1702766719;
    }

    private static int firstBadVersion(int n) {
        long left = 1, right = n;
        while (left <= right) {
            int mid = (int) ((left + right) / 2);
            if (isBadVersion(mid)) right = mid - 1;
            else left = mid + 1;
        }
        return (int) left;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(2126753390));
    }
}
