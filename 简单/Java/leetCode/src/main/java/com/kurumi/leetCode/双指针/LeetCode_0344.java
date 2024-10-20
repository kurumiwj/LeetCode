/**
 * @Author: kurumiwj
 * @Date: 2024-10-19 16:59:00
 * @Description: 344. 反转字符串
 */
package com.kurumi.leetCode.双指针;

public class LeetCode_0344 {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            s[left] ^= s[right];
            s[right] ^= s[left];
            s[left++] ^= s[right--];
        }
    }
}
