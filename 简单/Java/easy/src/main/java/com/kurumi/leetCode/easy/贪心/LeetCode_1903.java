package com.kurumi.leetCode.easy.贪心;

/**
 * @Author Administrator
 * @Date 2026年6月4日 20:31:39
 * @Description 1903. 字符串中的最大奇数
 */
public class LeetCode_1903 {
    public String largestOddNumber(String num) {
        char[] chars = num.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (isOdd(chars[i])) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    private boolean isOdd(char ch) {
        return (ch - '0') % 2 != 0;
    }

    public static void main(String[] args) {
        LeetCode_1903 test = new LeetCode_1903();
        String num = "35427";
        System.out.println(test.largestOddNumber(num));
    }
}
