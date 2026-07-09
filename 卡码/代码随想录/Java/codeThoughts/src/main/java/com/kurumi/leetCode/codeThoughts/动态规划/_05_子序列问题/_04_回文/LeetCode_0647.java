package com.kurumi.leetCode.codeThoughts.动态规划._05_子序列问题._04_回文;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 647. 回文子串
 */
public class LeetCode_0647 {
    static class Solution {
        // 动态规划
        public int countSubstrings(String s) {
            int n = s.length();
            boolean[][] dp = new boolean[n][n];
            int res = 0;
            for (int i = n - 1; i >= 0; i--) {
                for (int j = i; j < n; j++) {
                    if (s.charAt(i) == s.charAt(j) && (j - i <= 1 || dp[i + 1][j - 1] == true)) {
                        dp[i][j] = true;
                        res++;
                    }
                }
            }
            return res;
        }

        // 双指针
        public int countSubstrings1(String s) {
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                res += countPalindrome(s, i, i);
                res += countPalindrome(s, i, i + 1);
            }
            return res;
        }

        public int countPalindrome(String s, int i, int j) {
            int res = 0;
            while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
                res++;
            }
            return res;
        }
    }
}
