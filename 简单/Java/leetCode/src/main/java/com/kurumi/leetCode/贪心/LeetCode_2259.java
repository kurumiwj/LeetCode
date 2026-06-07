package com.kurumi.leetCode.贪心;

/**
 * @Author Administrator
 * @Date 2026年6月7日 21:41:32
 * @Description 2259. 移除指定数字得到的最大结果
 */
public class LeetCode_2259 {
    private static String removeDigit(String number, char digit) {
        StringBuilder builder = new StringBuilder(number);
        int index = -1;
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == digit) {
                index = i;
                if (i == builder.length() - 1) break;
                if (builder.charAt(i + 1) > digit) {
                    builder.deleteCharAt(i);
                    return builder.toString();
                }
            }
        }
        builder.deleteCharAt(index);
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDigit("123", '3'));
        System.out.println(removeDigit("1231", '1'));
        System.out.println(removeDigit("551", '5'));
    }
}
