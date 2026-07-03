package com.kurumi.codeThoughts.贪心._02_中等;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 122. 买卖股票的最佳时机 II
 */
public class LeetCode_0122 {
    static class Solution {
        public int maxProfit(int[] prices) {
            int res = 0;
            for (int i = 1; i < prices.length; i++) {
                int tmp = prices[i] - prices[i - 1];
                if (tmp > 0)
                    res += tmp;
            }
            return res;
        }
    }
}
