package com.kurumi.leetCode.双指针;

/**
 * @Author Administrator
 * @Date 2026年6月11日 22:25:47
 * @Description 2000. 反转单词前缀
 */
public class LeetCode_2000 {
    public String reversePrefix(String word, char ch) {
        char[] chs = word.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] == ch) {
                int left = 0, right = i;
                while (left < right) {
                    char tmp = chs[left];
                    chs[left] = chs[right];
                    chs[right] = tmp;
                    ++left;
                    --right;
                }
                return new String(chs);
            }
        }
        return word;
    }
}
