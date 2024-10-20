/**
 * @Author: kurumiwj
 * @Date: 2024-10-20 13:59:49
 * @Description: 541. 反转字符串 II
 */
package com.kurumi.leetCode.双指针;

public class LeetCode_0541 {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i += 2 * k) {
            int start = i, end = Math.min(start + k - 1, chars.length - 1);
            while (start < end) {
                chars[start] ^= chars[end];
                chars[end] ^= chars[start];
                chars[start] ^= chars[end];
                ++start;
                --end;
            }
        }
        return new String(chars);
    }
}
