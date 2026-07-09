package com.kurumi.leetCode.easy.贪心;

import java.util.Arrays;

/**
 * @Author Administrator
 * @Date 2026年6月7日 22:08:13
 * @Description 2335. 装满杯子需要的最短总时长
 */
public class LeetCode_2335 {
    private static int fillCups(int[] amount) {
        int res = 0;
        Arrays.sort(amount);
        if (amount[0] + amount[1] >= amount[2]) {
            res += amount[2];
            int left = amount[0] + amount[1] - amount[2];
            if (left > 0) res += Math.ceil(left * 1.0 / 2);
        } else {
            res = amount[2];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fillCups(new int[]{1, 4 ,2}));
        System.out.println(fillCups(new int[]{5, 4, 4}));
        System.out.println(fillCups(new int[]{5, 0, 0}));
    }
}
