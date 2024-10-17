// 125. 验证回文串
package com.kurumi.leetCode.双指针;

/**
 * @author: kurumi
 * @date: 2024-10-17 23:56:57
 */
public class LeetCode_0125 {
//    public boolean isPalindrome(String s) {
//        s = s.replaceAll("\\W|[_]", "");
//        s = s.toLowerCase();
//        int start = 0, end = s.length() - 1;
//        while (start < end) {
//            if (s.charAt(start) != s.charAt(end)) {
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }
    public boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) start++;
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) end--;
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        LeetCode_0125 test = new LeetCode_0125();
        System.out.println(test.isPalindrome("ab_a"));
    }
}
