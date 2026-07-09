package com.kurumi.leetCode.easy.双指针;

/**
 * @Author Administrator
 * @Date 2026年6月13日 17:35:39
 * @Description 3823. 反转一个字符串里的字母后反转特殊字符
 */
public class LeetCode_3823 {
    public String reverseByType(String s) {
        char[] chs = s.toCharArray();
        int i = 0, j = chs.length - 1;
        while (i < j) {
            if (Character.isAlphabetic(chs[i]) && Character.isAlphabetic(chs[j])) {
                char tmp = chs[i];
                chs[i] = chs[j];
                chs[j] = tmp;
                ++i;
                --j;
            } else if (Character.isAlphabetic(chs[i])) --j;
            else if (Character.isAlphabetic(chs[j])) ++i;
            else {
                ++i;
                --j;
            }
        }
        i = 0;
        j = chs.length - 1;
        while (i < j) {
            if (!Character.isAlphabetic(chs[i]) && !Character.isAlphabetic(chs[j])) {
                char tmp = chs[i];
                chs[i] = chs[j];
                chs[j] = tmp;
                ++i;
                --j;
            } else if (!Character.isAlphabetic(chs[i])) {
                --j;
            } else if (!Character.isAlphabetic(chs[j])) {
                ++i;
            } else {
                ++i;
                --j;
            }
        }
        return new String(chs);
    }
}
