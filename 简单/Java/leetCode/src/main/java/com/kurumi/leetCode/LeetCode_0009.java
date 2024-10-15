// 9. 回文数
package com.kurumi.leetCode;

public class LeetCode_0009 {
    public boolean isPalindrome(int x) {
        char[] chs = String.valueOf(x).toCharArray();
        int start = 0, end = chs.length-1;
        while (start < end) {
            if (chs[start] != chs[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}
