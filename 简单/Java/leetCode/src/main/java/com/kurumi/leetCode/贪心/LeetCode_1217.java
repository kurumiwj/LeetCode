package com.kurumi.leetCode.贪心;

/**
 * @Author kurumi
 * @Date 2024-10-24 下午11:16:20
 * @Description 1217. 玩筹码
 */
public class LeetCode_1217 {
    public int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;
        for (int pos : position) {
            if ((pos & 1) != 0) ++odd;
            else ++even;
        }
        return Math.min(odd, even);
    }
}
