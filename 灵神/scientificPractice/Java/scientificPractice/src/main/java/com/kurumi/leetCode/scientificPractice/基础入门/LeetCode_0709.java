package com.kurumi.leetCode.scientificPractice.基础入门;

/**
 * @Author kurumi
 * @Date 2026-07-09 下午11:31:28
 * @Description 709. 转换成小写字母
 */
public class LeetCode_0709 {
    static class Solution {
        public String toLowerCase(String s) {
            return s.toLowerCase();
        }
    }

    static class Solution1 {
        public String toLowerCase(String s) {
            char[] chs = s.toCharArray();
            for (int i = 0; i < chs.length; i++) {
                char ch = chs[i];
                if (ch >= 'A' && ch <= 'Z') chs[i] |= 32;
            }
            return new String(chs);
        }
    }
}
