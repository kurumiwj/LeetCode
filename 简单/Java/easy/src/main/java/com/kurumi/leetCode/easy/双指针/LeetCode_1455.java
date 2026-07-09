package com.kurumi.leetCode.easy.双指针;

/**
 * @Author Administrator
 * @Date 2026年6月11日 22:01:39
 * @Description 1455. 检查单词是否为句中其他单词的前缀
 */
public class LeetCode_1455 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) return i + 1;
        }
        return -1;
    }
}
