package com.kurumi.leetCode.easy.双指针;

/**
 * @Author kurumi
 * @Date 2026-06-13 下午4:35:50
 * @Description 3750. 最少翻转次数得到反转二进制字符串
 */
public class LeetCode_3750 {
    private static int minimumFlips(int n) {
        String binStr = Integer.toBinaryString(n);
        int i = 0, j = binStr.length() - 1, res = 0;
        while (i < binStr.length()) {
            if (binStr.charAt(i) != binStr.charAt(j)) ++res;
            ++i;
            --j;
        }
        return res;
    }

    private static int minimumFlips2(int n) {
        int reverseNum = Integer.reverse(n) >>> Integer.numberOfLeadingZeros(n);
        return Integer.bitCount(n ^ reverseNum);
    }

    public static void main(String[] args) {
        System.out.println(minimumFlips2(7));
        System.out.println(minimumFlips2(10));
    }
}
