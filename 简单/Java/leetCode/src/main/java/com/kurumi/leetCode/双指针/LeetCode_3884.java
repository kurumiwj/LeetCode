package com.kurumi.leetCode.双指针;

/**
 * @Author Administrator
 * @Date 2026年6月13日 17:44:31
 * @Description 3884. 双端字符匹配
 */
public class LeetCode_3884 {
    public int firstMatchingIndex(String s) {
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) return i;
            ++i;
            --j;
        }
        return -1;
    }
}
