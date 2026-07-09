package com.kurumi.leetCode.easy.基础入门;

/**
 * @Author kurumi
 * @Date 2026-07-10 上午12:20:16
 * @Description 1422. 分割字符串的最大得分
 */
public class LeetCode_1422 {
    static class Solution {
        public int maxScore(String s) {
            char[] chs = s.toCharArray();
            int n = chs.length, res = 0, rightOne = 0, leftZero = 0;
            for (char ch : chs) {
                rightOne += ch - '0';
            }
            for (int i = 0; i < n - 1; i++) {
                if (chs[i] == '1') --rightOne;
                else ++leftZero;
                res = Math.max(res, leftZero + rightOne);
            }
            return res;
        }
    }

    static class Solution1 {
        public int maxScore(String s) {
            char[] chs = s.toCharArray();
            int n = chs.length, res = 0, score = 0;
            for (char ch : chs) {
                score += ch - '0';
            }
            for (int i = 0; i < n - 1; i++) {
                if (chs[i] == '1') --score;
                else ++score;
                res = Math.max(res, score);
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.maxScore("011101"));
        System.out.println(solution.maxScore("1111"));
        System.out.println(solution.maxScore("01001"));
    }
}
