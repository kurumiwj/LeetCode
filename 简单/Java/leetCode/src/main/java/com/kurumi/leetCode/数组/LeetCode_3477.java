package com.kurumi.leetCode.数组;

/**
 * @Author kurumi
 * @Date 2026-06-21 下午8:51:05
 * @Description 3477. 水果成篮 II
 */
public class LeetCode_3477 {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] used = new boolean[baskets.length];
        int res = 0;
        for (int fruit : fruits) {
            boolean flag = false;
            for (int i = 0; i < baskets.length; ++i) {
                if (used[i]) continue;
                if (baskets[i] >= fruit) {
                    flag = true;
                    used[i] = true;
                    break;
                }
            }
            if (!flag) ++res;
        }
        return res;
    }
}
