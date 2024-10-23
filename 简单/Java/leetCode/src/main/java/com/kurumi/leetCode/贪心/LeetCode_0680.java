package com.kurumi.leetCode.贪心;

/**
 * @Author kurumi
 * @Date 2024年10月23日 上午1:46:54
 * @Description 680. 验证回文串 II
 */
public class LeetCode_0680 {
    public boolean validPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                ++start;
                --end;
            } else {
                return validPalindrome(s, start + 1, end) || validPalindrome(s, start, end - 1);
            }
        }
        return true;
    }

    public boolean validPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                ++start;
                --end;
            } else {
                return false;
            }
        }
        return true;
    }
}
