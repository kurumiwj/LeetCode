package com.kurumi.leetCode.双指针;

/**
 * @Author Administrator
 * @Date 2026年6月10日 21:56:11
 * @Description 844. 比较含退格的字符串
 */
public class LeetCode_0844 {
    private static String convert(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '#') {
                sb.append(ch);
            } else {
                if (sb.length() != 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }
        return sb.toString();
    }

    private static boolean backspaceCompare(String s, String t) {
        return convert(s).equals(convert(t));
    }

    // 双指针

    private static String convert2(String s) {
        char[] chs = s.toCharArray();
        int index = 0, i = 0;
        while (i < chs.length) {
            if (chs[i] != '#') {
                chs[index++] = chs[i];
            } else {
                if (index > 0) --index;
            }
            ++i;
        }
        return new String(chs, 0, index);
    }
    private static boolean backspaceCompare2(String s, String t) {
        return convert2(s).equals(convert2(t));
    }

    public static void main(String[] args) {
        System.out.println("" + backspaceCompare2("ab#c", "ad#c"));
        System.out.println("" + backspaceCompare2("ab##", "c#d#"));
        System.out.println("" + backspaceCompare2("a#c", "b"));
    }
}
