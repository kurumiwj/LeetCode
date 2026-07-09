package com.kurumi.leetCode.easy.双指针;

/**
 * @Author Administrator
 * @Date 2026年6月11日 22:28:49
 * @Description 2108. 找出数组中的第一个回文字符串
 */
public class LeetCode_2108 {
    private static boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) return false;
            ++left;
            --right;
        }
        return true;
    }

    private static String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) return word;
        }
        return "";
    }
}
