package com.kurumi.leetCode.scientificPractice.滑动窗口.不定长.basic;

/**
 * @Author kurumi
 * @Date 2026-06-23 下午8:22:53
 * @Description 3. 无重复字符的最长子串
 */
public class LeetCode_0003 {
    public int lengthOfLongestSubstring(String s) {
        char[] chs = s.toCharArray();
        int res = 0, n = chs.length, left = 0;
        int[] cnt = new int[128];
        for (int right = 0; right < n; ++right) {
            char ch = chs[right];
            ++cnt[ch];
            while (cnt[ch] > 1) {
                --cnt[chs[left]];
                ++left;
            }
            res = Math.max(right - left + 1, res);
        }
        return res;
    }
}
