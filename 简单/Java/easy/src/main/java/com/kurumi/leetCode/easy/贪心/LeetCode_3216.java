package com.kurumi.leetCode.easy.贪心;

/**
 * @Author Administrator
 * @Date 2026年6月9日 21:45:26
 * @Description 3216. 交换后字典序最小的字符串
 */
public class LeetCode_3216 {
    private static String getSmallestString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) % 2 == sb.charAt(i + 1) % 2) {
                if (sb.charAt(i) > sb.charAt(i + 1)) {
                    char tmp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(i + 1));
                    sb.setCharAt(i + 1, tmp);
                    break;
                }
            }
        }
        return new String(sb);
    }

    public static void main(String[] args) {
        System.out.println(getSmallestString("45320"));
        System.out.println(getSmallestString("001"));
    }
}
