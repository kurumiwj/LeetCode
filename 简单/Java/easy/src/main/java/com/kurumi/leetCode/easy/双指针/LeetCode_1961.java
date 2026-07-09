package com.kurumi.leetCode.easy.双指针;

/**
 * @Author Administrator
 * @Date 2026年6月11日 22:14:46
 * @Description 1961. 检查字符串是否为数组前缀
 */
public class LeetCode_1961 {
    private static boolean isPrefixString(String s, String[] words) {
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            word.append(words[i]);
            if (word.length() > s.length()) return false;
            else if (word.length() == s.length()) return word.toString().equals(s);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPrefixString("a", new String[]{"a", "ad", "cookie"}));
    }
}
