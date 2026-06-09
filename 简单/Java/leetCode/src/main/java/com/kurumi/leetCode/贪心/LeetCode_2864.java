package com.kurumi.leetCode.贪心;

/**
 * @Author Administrator
 * @Date 2026年6月9日 21:16:56
 * @Description 2864. 最大二进制奇数
 */
public class LeetCode_2864 {
    private static String maximumOddBinaryNumber(String s) {
        char[] chs = s.toCharArray();
        int index = 0;
        for (int i = 0; i < chs.length - 1; i++) {
            if (chs[i] == '1') {
                chs[i] = '0';
                chs[index++] = '1';
            }
        }
        // 最后一位不是1
        if (chs[chs.length - 1] == '0') {
            chs[index-1] = '0';
            chs[chs.length-1] = '1';
        }
        return new String(chs);
    }

    public static void main(String[] args) {
        System.out.println(maximumOddBinaryNumber("010"));
        System.out.println(maximumOddBinaryNumber("0101"));
    }
}
