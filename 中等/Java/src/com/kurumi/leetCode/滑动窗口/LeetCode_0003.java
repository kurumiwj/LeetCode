package com.kurumi.leetCode.滑动窗口;

/**
 * @Author kurumi
 * @Date 2026-07-03 下午2:05:42
 * @Description 3. 无重复字符的最长子串
 */
public class LeetCode_0003 {
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            char[] chs = s.toCharArray();
            int[] cnt = new int[128];
            int n = chs.length, i = 0, res = 0;
            for (int j = i; j < n; j++) {
                ++cnt[chs[j]];
                while (cnt[chs[j]] > 1) {
                    --cnt[chs[i++]];
                }
                res = Math.max(res, j - i + 1);
            }
            return res;
        }
    }
}
