package com.kurumi.leetCode.easy.基础入门;

/**
 * @Author kurumi
 * @Date 2026-07-10 上午12:47:26
 * @Description 2586. 统计范围内的元音字符串数
 */
public class LeetCode_2586 {
    static class Solution {
        private boolean isVowel(char ch) {
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }

        public int vowelStrings(String[] words, int left, int right) {
            int cnt = 0;
            for (int i = left; i <= right; i++) {
                String word = words[i];
                if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) ++cnt;
            }
            return cnt;
        }
    }
}
