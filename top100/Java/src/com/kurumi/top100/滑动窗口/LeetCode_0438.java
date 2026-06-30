package com.kurumi.top100.滑动窗口;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午5:52:00
 * @Description 438. 找到字符串中所有字母异位词
 */
public class LeetCode_0438 {
    static class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> res = new ArrayList<>();
            int[] hash = new int[30], cnt = new int[30];
            char[] chs = s.toCharArray(), chp = p.toCharArray();
            for (char c : chp) ++hash[c - 'a'];
            int left = 0;
            for (int right = left; right < chs.length; ++right) {
                ++cnt[chs[right] - 'a'];
                while (cnt[chs[right] - 'a'] > hash[chs[right] - 'a']) {
                    --cnt[chs[left++] - 'a'];
                }
                if (right - left + 1 == chp.length) res.add(left);
            }
            return res;
        }
    }
}
