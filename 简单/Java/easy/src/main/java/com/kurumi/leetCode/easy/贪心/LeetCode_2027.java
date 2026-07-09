package com.kurumi.leetCode.easy.贪心;

/**
 * @Author Administrator
 * @Date 2026年6月7日 20:49:40
 * @Description 2027. 转换字符串的最少操作次数
 */
public class LeetCode_2027 {
    private static int minimumMoves(String s) {
        int res = 0, i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch == 'X') {
                i += 3;
                res++;
            } else {
                ++i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(minimumMoves("XXOX"));
        System.out.println(minimumMoves("XXX"));
        System.out.println(minimumMoves("OOOO"));
    }
}
