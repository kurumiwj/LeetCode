package com.kurumi.scientificPractice.slideWindow.variableLength.basic;

/**
 * @Author kurumi
 * @Date 2026-06-23 下午8:37:43
 * @Description 3090. 每个字符最多出现两次的最长子字符串
 */
public class LeetCode_3090 {
    public int maximumLengthSubstring(String s) {
        char[] chs = s.toCharArray();
        int n = chs.length, res = 0, left = 0;
        int[] cnt = new int[30];
        for (int right = 0; right < n; ++right) {
            char ch = chs[right];
            ++cnt[ch-'a'];
            while (cnt[ch-'a'] > 2) {
                --cnt[chs[left]-'a'];
                ++left;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
