package com.kurumi.leetCode.双指针;

/**
 * @Author Administrator
 * @Date 2026年6月10日 22:32:28
 * @Description 917. 仅仅反转字母
 */
public class LeetCode_0917 {
    private static String reverseOnlyLetters(String s) {
        char[] chs = s.toCharArray();
        int left = 0, right = chs.length - 1;
        while (left < right) {
            while (!Character.isAlphabetic(chs[left])) {
                ++left;
                if (left > right) break;
            }
            while (!Character.isAlphabetic(chs[right])) {
                --right;
                if (left > right) break;
            }
            if (left < right) {
                char tmp = chs[left];
                chs[left] = chs[right];
                chs[right] = tmp;
                ++left;
                --right;
            }
        }
        return new String(chs);
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd"));
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
        System.out.println(reverseOnlyLetters("7_28]"));
    }
}
