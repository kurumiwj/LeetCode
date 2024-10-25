package com.kurumi.leetCode.双指针;

/**
 * @Author kurumi
 * @Date 2024年10月25日 下午7:34:36
 * @Description 557. 反转字符串中的单词 III
 */
public class LeetCode_0557 {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        for (int i = 0; i < strs.length; ++i) {
            strs[i] = reverse(strs[i]);
        }
        return String.join(" ", strs);
    }
    private String reverse(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length-1;
        while (left < right) {
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            ++left;
            --right;
        }
        return String.valueOf(chars);
    }
}
