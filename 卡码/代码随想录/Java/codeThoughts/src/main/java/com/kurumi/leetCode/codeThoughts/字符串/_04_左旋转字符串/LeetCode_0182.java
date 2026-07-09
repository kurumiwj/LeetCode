package com.kurumi.leetCode.codeThoughts.字符串._04_左旋转字符串;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description LCR 182. 动态口令
 */
public class LeetCode_0182 {
    static class Solution {
        public String dynamicPassword(String password, int target) {
            StringBuilder builder = new StringBuilder(password);
            int n = password.length();
            reverse(builder, 0, target - 1);
            reverse(builder, target, n - 1);
            reverse(builder, 0, n - 1);
            return builder.toString();
        }

        public static StringBuilder reverse(StringBuilder builder, int start, int end) {
            while (start < end) {
                char tmp = builder.charAt(start);
                builder.setCharAt(start, builder.charAt(end));
                builder.setCharAt(end, tmp);
                start++;
                end--;
            }
            return builder;
        }
    }
}
