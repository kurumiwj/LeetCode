package com.kurumi.codeThoughts.贪心._02_中等;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 135. 分发糖果
 */
public class LeetCode_0135 {
    static class Solution {
        public int candy(int[] ratings) {
            int[] can = new int[ratings.length];
            Arrays.fill(can, 1);
            for (int i = 1; i < ratings.length; i++)
                if (ratings[i] > ratings[i - 1])
                    can[i] = can[i - 1] + 1;
            for (int i = ratings.length - 2; i >= 0; i--)
                if (ratings[i] > ratings[i + 1])
                    can[i] = Integer.max(can[i + 1] + 1, can[i]);
            int sum = 0;
            for (int val : can)
                sum += val;
            return sum;
        }
    }
}
