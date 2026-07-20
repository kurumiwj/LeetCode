package com.kurumi.leetCode.basicPractice.动态规划.线性DP1;

/**
 * @Author kurumi
 * @Date 2026年7月14日 23:29:51
 * @Description 712. 两个字符串的最小ASCII删除和
 */
public class LeetCode_0712 {
    static class Solution {
        public int minimumDeleteSum(String s1, String s2) {
            char[] chs1 = s1.toCharArray(), chs2 = s2.toCharArray();
            int[][] dp = new int[chs1.length + 1][chs2.length + 1];
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < chs1.length; i++) sum1 += chs1[i];
            for (int j = 0; j < chs2.length; j++) sum2 += chs2[j];
            for (int i = 0; i < chs1.length; i++) {
                for (int j = 0; j < chs2.length; j++) {
                    if (chs1[i] == chs2[j]) dp[i + 1][j + 1] = dp[i][j] + chs1[i];
                    else dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
            return sum1 + sum2 - 2 * dp[chs1.length][chs2.length];
        }
    }

    static class Solution1 {
        public int minimumDeleteSum(String s1, String s2) {
            char[] chs1 = s1.toCharArray(), chs2 = s2.toCharArray();
            int[] dp = new int[chs2.length + 1];
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < chs1.length; i++) sum1 += chs1[i];
            for (int j = 0; j < chs2.length; j++) sum2 += chs2[j];
            for (char ch : chs1) {
                int pre = dp[0];
                for (int j = 0; j < chs2.length; j++) {
                    int tmp = dp[j + 1];
                    if (ch == chs2[j]) dp[j + 1] = pre + ch;
                    else dp[j + 1] = Math.max(dp[j + 1], dp[j]);
                    pre = tmp;
                }
            }
            return sum1 + sum2 - 2 * dp[chs2.length];
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.minimumDeleteSum("sea", "eat"));
        System.out.println(solution.minimumDeleteSum("delete", "leet"));
    }
}
