package com.kurumi.leetCode.贪心;

import java.util.Arrays;

/**
 * @Author Administrator
 * @Date 2026年6月8日 22:06:44
 * @Description 2578. 最小和分割
 */
public class LeetCode_2578 {
    private static int splitNum(int num) {
        String numStr = String.valueOf(num);
        char[] chs = numStr.toCharArray();
        Arrays.sort(chs);
        int res = 0;
        double fact = 0;
        for (int i = chs.length - 1; i >= 0; i-=2) {
            res += Math.pow(10.0, fact++) * (chs[i] - '0' + (i > 0 ? chs[i - 1] - '0' : 0));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(splitNum(4325));
        System.out.println(splitNum(687));
    }
}
