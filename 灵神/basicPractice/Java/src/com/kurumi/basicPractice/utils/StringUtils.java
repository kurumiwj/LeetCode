package com.kurumi.basicPractice.utils;

/**
 * @Author kurumi
 * @Date 2026-07-05 下午1:46:51
 * @Description StringUtils
 */
public class StringUtils {
    // 判断字符串是否为回文
    public static boolean isPalindrome(String str) {
        if (str.length() == 1) return true;
        int left = 0, right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            ++left;
            --right;
        }
        return true;
    }
}
