package com.kurumi.leetCode.easy.贪心;

import java.util.Arrays;

/**
 * @Author Administrator
 * @Date 2026年6月7日 21:21:31
 * @Description 2160. 拆分数位后四位数字的最小和
 */
public class LeetCode_2160 {
    private static int minimumSum(int num) {
        int res = 0;
        char[] chs = String.valueOf(num).toCharArray();
        Arrays.sort(chs);
        return (chs[0] - '0') * 10 + chs[3] - '0' + (chs[1] - '0') * 10 + chs[2] - '0';
    }

    public static void main(String[] args) {
        System.out.println(minimumSum(2932));
        System.out.println(minimumSum(4009));
    }
}
