package com.kurumi.leetCode.贪心;

/**
 * @Author Administrator
 * @Date 2026年6月9日 21:09:38
 * @Description 2697. 字典序最小回文串
 */
public class LeetCode_2697 {
    private static String makeSmallestPalindrome(String s) {
        char[] chs = s.toCharArray();
        int left = 0, right = chs.length - 1;
        while (left < right) {
            if (chs[left] == chs[right]) {
                ++left;
                --right;
            } else {
                if (chs[left] < chs[right]) chs[right] = chs[left];
                else chs[left] = chs[right];
            }
        }
        return new String(chs);
    }

    public static void main(String[] args) {
        System.out.println(makeSmallestPalindrome("egcfe"));
        System.out.println(makeSmallestPalindrome("abcd"));
        System.out.println(makeSmallestPalindrome("seven"));
    }
}
