package com.kurumi.leetCode.codeThoughts.字符串._01_反转字符串;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 344. 反转字符串
 */
public class LeetCode_0344 {
    static class Solution {
        public void reverseString(char[] s) {
            int left = 0, right = s.length - 1;
            while (left < right) {
                s[left] ^= s[right];
                s[right] ^= s[left];
                s[left++] ^= s[right--];
            }
        }
    }
}
