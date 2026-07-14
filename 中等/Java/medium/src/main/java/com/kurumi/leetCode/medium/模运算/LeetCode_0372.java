package com.kurumi.leetCode.medium.模运算;

/**
 * @Author kurumi
 * @Date 2026年7月14日 15:54:38
 * @Description 372. 超级次方
 */
public class LeetCode_0372 {
    static class Solution {
        private final int MOD = 1337;

        private int qpowMod(int n, int e) {
            int res = 1;
            n %= MOD;
            while (e > 0) {
                if ((e & 1) == 1) res = res * n % MOD;
                n = n * n % MOD;
                e >>= 1;
            }
            return res;
        }

        public int superPow(int a, int[] b) {
            int res = 1;
            a %= MOD;
            for (int digit : b) {
                // a ^ (x * 10 + digit) = (a ^ x) ^ 10 * a ^ digit。
                res = qpowMod(res, 10) * qpowMod(a, digit) % MOD;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.superPow(2, new int[] {3}));
        System.out.println(solution.superPow(2, new int[] {1,0}));
        System.out.println(solution.superPow(1, new int[] {4, 3, 3, 8, 5, 2}));
        System.out.println(solution.superPow(2, new int[] {2,3}));
        System.out.println(solution.superPow(78267, new int[] {2,3}));
    }
}
