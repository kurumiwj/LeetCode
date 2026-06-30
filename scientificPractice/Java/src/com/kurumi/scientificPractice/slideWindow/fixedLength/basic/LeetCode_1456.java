package com.kurumi.scientificPractice.slideWindow.fixedLength.basic;

/**
 * @Author kurumi
 * @Date 2026-06-21 下午10:18:08
 * @Description
 */
public class LeetCode_1456 {
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    private static int maxVowels(String s, int k) {
        char[] chs = s.toCharArray();
        int maxLen = 0, left = 0, right = k - 1, curLen = 0;
        for (int i = left; i <= right; ++i) {
            if (isVowel(chs[i])) ++curLen;
        }
        maxLen = curLen;
        for (int i = right + 1; i < chs.length; ++i) {
            // 左端口
            if (isVowel(chs[left])) --curLen;
            ++left;
            // 右端口
            if (isVowel(chs[i])) ++curLen;
            maxLen = Math.max(curLen, maxLen);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
        System.out.println(maxVowels("aeiou", 2));
        System.out.println(maxVowels("leetcode", 3));
        System.out.println(maxVowels("rhythms", 4));
        System.out.println(maxVowels("tryhard", 4));
        System.out.println(maxVowels("weallloveyou", 7));
    }
}
