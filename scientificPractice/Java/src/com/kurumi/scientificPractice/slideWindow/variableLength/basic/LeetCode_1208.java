package com.kurumi.scientificPractice.slideWindow.variableLength.basic;

/**
 * @Author kurumi
 * @Date 2026-06-23 下午9:51:04
 * @Description 1208. 尽可能使字符串相等
 */
public class LeetCode_1208 {
    private static int equalSubstring(String s, String t, int maxCost) {
        char[] chsS = s.toCharArray(), chsT = t.toCharArray();
        int left = 0, n = chsS.length, sum = 0, maxLen = 0;
        for (int right = 0; right < n; ++right) {
            sum += Math.abs(chsS[right] - chsT[right]);
            if (sum <= maxCost) maxLen = Math.max(maxLen, right - left + 1);
            else {
                sum -= Math.abs(chsS[left] - chsT[left]);
                ++left;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(equalSubstring("abcd", "bcdf", 3));
        System.out.println(equalSubstring("abcd", "cdef", 3));
        System.out.println(equalSubstring("abcd", "cdef", 1));
    }
}
