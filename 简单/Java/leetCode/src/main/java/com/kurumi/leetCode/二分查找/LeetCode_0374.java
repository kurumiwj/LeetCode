package com.kurumi.leetCode.二分查找;

/**
 * @Author kurumi
 * @Date 2026-06-14 下午12:26:49
 * @Description 374. 猜数字大小
 */
public class LeetCode_0374 {
    private static int guess(int num) {
        int target = 1702766719;
        if (num > target) return -1;
        else if (num < target) return 1;
        else return 0;
    }

    private static int guessNumber(int n) {
        long i = 1, j = n;
        while (i <= j) {
            int mid = (int) ((i + j) / 2);
            if (guess(mid) == 0) return mid;
            else if (guess(mid) == -1) j = mid - 1;
            else i = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(2126753390));
    }
}
