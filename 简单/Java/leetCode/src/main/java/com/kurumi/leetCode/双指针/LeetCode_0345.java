/**
 * @Author: kurumiwj
 * @Date: 2024-10-19 17:11:21
 * @Description: 345. 反转字符串中的元音字母
 */
package com.kurumi.leetCode.双指针;

public class LeetCode_0345 {
    /**
     * 判断是否是元音
     * @param ch
     * @return boolean
     */
    private boolean isVowel(Character ch) {
        return Character.toLowerCase(ch) == 'a' || Character.toLowerCase(ch) == 'e' || Character.toLowerCase(ch) == 'i' || Character.toLowerCase(ch) == 'o' || Character.toLowerCase(ch) == 'u';
    }
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0, end = chars.length - 1;
        while (start < end) {
            while (start < end && !isVowel(chars[start]))
                ++start;
            while (start < end && !isVowel(chars[end]))
                --end;
            if (start < end) {
                char tmp = chars[start];
                chars[start] = chars[end];
                chars[end] = tmp;
                ++start;
                --end;
            } else
                break;
        }
        return new String(chars);
    }
}
