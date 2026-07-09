package com.kurumi.leetCode.scientificPractice.滑动窗口.定长.advanced;

/**
 * @Author kurumi
 * @Date 2026-06-23 上午10:46:04
 * @Description 1052. 爱生气的书店老板
 */
public class LeetCode_1052 {
    private static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int left = 0, right = 0, sum = 0;
        while (right < minutes) {
            if (grumpy[right] == 1) sum += customers[right];
            ++right;
        }
        int maxSum = sum, maxLeft = left, maxRight = right - 1;
        while (right < customers.length) {
            if (grumpy[left] == 1) sum -= customers[left];
            ++left;
            if (grumpy[right] == 1) sum += customers[right];
            ++right;
            if (sum > maxSum) {
                maxSum = sum;
                maxLeft = left;
                maxRight = right - 1;
            }
        }
        int res = 0;
        for (int i = 0; i < maxLeft; ++i) {
            if (grumpy[i] == 0) res += customers[i];
        }
        for (int i = maxRight + 1; i < customers.length; ++i) {
            if (grumpy[i] == 0) res += customers[i];
        }
        for (int i = maxLeft; i <= maxRight; ++i) {
            res += customers[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxSatisfied(new int[] {1,0,1,2,1,1,7,5}, new int[] {0,1,0,1,0,1,0,1}, 3));
    }
}
