package com.kurumi.leetCode.easy.双指针;

/**
 * @Author kurumi
 * @Date 2026-06-13 下午2:54:20
 * @Description 2697. 字典序最小回文串
 */
public class LeetCode_2697 {
    public String makeSmallestPalindrome(String s) {
        char[] chs = s.toCharArray();
        int left = 0, right = chs.length - 1;
        while (left < right) {
            if (chs[left] == chs[right]) {
                ++left;
                --right;
            } else {
                if (chs[left] < chs[right]) chs[right] = chs[left];
                else chs[left] = chs[right];
            }
        }
        return new String(chs);
    }
    
    public static void main(String[] args) {
        
    }
}
