package com.kurumi.leetCode.贪心;

/**
 * @Author Administrator
 * @Date 2026年6月8日 21:49:30
 * @Description 2566. 替换一个数字后的最大差值
 */
public class LeetCode_2566 {
    private static int minMaxDifference(int num) {
        String str = String.valueOf(num);
        int begin = 0, maxNum = num;
        while (begin < str.length() && str.charAt(begin) == '9') {
            ++begin;
        }
        if (begin < str.length()) {
            maxNum = Integer.parseInt(str.replace(str.charAt(begin), '9'));
        }
        int minNum = Integer.parseInt(str.replace(str.charAt(0), '0'));
        return maxNum - minNum;
    }

    public static void main(String[] args) {
        System.out.println(minMaxDifference(11891));
        System.out.println(minMaxDifference(90));
    }
}
