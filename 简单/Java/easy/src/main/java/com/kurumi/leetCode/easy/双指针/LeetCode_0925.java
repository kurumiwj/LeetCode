package com.kurumi.leetCode.easy.双指针;

/**
 * @Author Administrator
 * @Date 2026年6月11日 20:10:21
 * @Description 925. 长按键入
 */
public class LeetCode_0925 {
    private static boolean isLongPressedName(String name, String typed) {
        int j = 0;
        for (int i = 0; i < name.length();) {
            if (j >= typed.length()) return false;
            if (name.charAt(i) == typed.charAt(j)) {
                ++i;
                ++j;
            } else {
                if (j != 0 && typed.charAt(j) == typed.charAt(j - 1)) ++j;
                else return false;
            }
        }
        while (j < typed.length()) {
            if (typed.charAt(j) != typed.charAt(j - 1)) return false;
            ++j;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isLongPressedName("alex", "aaleex"));
        System.out.println(isLongPressedName("saeed", "ssaaedd"));
        System.out.println(isLongPressedName("alex", "aaleexa"));
        System.out.println(isLongPressedName("alex", "aaleelx"));
        System.out.println(isLongPressedName("a", "b"));
    }
}
