package com.kurumi.codeThoughts.字符串._02_反转字符串2;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 541. 反转字符串 II
 */
public class LeetCode_0541 {
    static class Solution {
        public String reverseStr(String s, int k) {
            char[] ch = s.toCharArray();
            for (int i = 0; i < ch.length; i += 2 * k) {
                int start = i, end = Math.min(start + k - 1, ch.length - 1);
                while (start < end) {
                    ch[start] ^= ch[end];
                    ch[end] ^= ch[start];
                    ch[start++] ^= ch[end--];
                }
            }
            return new String(ch);
        }
    }
}
