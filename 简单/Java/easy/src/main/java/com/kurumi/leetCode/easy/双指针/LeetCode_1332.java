package com.kurumi.leetCode.easy.双指针;

/**
 * @Author Administrator
 * @Date 2026年6月11日 21:35:34
 * @Description 1332. 删除回文子序列
 */
public class LeetCode_1332 {
    private static int removePalindromeSub(String s) {
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) == s.charAt(right)) {
                ++left;
                --right;
            } else return 2;
        }
        return 1;
    }
}
