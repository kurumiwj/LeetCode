package com.kurumi.leetCode.codeThoughts.动态规划._02_背包问题._01_01背包;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 1049. 最后一块石头的重量 II
 */
public class LeetCode_1049 {
    static class Solution {
        public int lastStoneWeightII(int[] stones) {
            int sum = 0;
            for (int stone : stones)
                sum += stone;
            int target = sum / 2;
            int[] dp = new int[1501];
            for (int i = 0; i < stones.length; i++) {
                for (int j = target; j >= stones[i]; j--) {
                    dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
                }
            }
            return sum - 2 * dp[target];
        }
    }
}
