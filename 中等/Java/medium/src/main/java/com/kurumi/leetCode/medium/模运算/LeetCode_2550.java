package com.kurumi.leetCode.medium.模运算;

import com.kurumi.leetCode.medium.utils.MathUtils;

/**
 * @Author kurumi
 * @Date 2026年7月14日 17:22:48
 * @Description 2550. 猴子碰撞的方法数
 */
public class LeetCode_2550 {
    static class Solution {
        private final int MOD = 1_000_000_007;

        public int monkeyMove(int n) {
            return (MathUtils.qpow(2, n, MOD) - 2 + MOD) % MOD;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.monkeyMove(55));
        System.out.println(solution.monkeyMove(500000003));
    }
}
