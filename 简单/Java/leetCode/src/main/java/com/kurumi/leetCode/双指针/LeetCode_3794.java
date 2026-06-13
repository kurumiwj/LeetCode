package com.kurumi.leetCode.双指针;

/**
 * @Author Administrator
 * @Date 2026年6月13日 17:32:01
 * @Description 3794. 反转字符串前缀
 */
public class LeetCode_3794 {
    public String reversePrefix(String s, int k) {
        char[] chs = s.toCharArray();
        int i = 0, j = k - 1;
        while (i < j) {
            char tmp = chs[i];
            chs[i] = chs[j];
            chs[j] = tmp;
            ++i;
            --j;
        }
        return new String(chs);
    }
}
