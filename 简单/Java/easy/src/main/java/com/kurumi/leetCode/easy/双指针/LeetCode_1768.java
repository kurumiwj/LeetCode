package com.kurumi.leetCode.easy.双指针;

/**
 * @Author Administrator
 * @Date 2026年6月11日 22:11:09
 * @Description 1768. 交替合并字符串
 */
public class LeetCode_1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int index1 = 0, index2 = 0;
        for (; index1 < word1.length() && index2 < word2.length(); index1++, index2++) {
            sb.append(word1.charAt(index1)).append(word2.charAt(index2));
        }
        while (index1 < word1.length()) sb.append(word1.charAt(index1++));
        while (index2 < word2.length()) sb.append(word2.charAt(index2++));
        return sb.toString();
    }
}
