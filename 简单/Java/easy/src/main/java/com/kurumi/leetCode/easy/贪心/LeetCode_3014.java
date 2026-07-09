package com.kurumi.leetCode.easy.贪心;

/**
 * @Author Administrator
 * @Date 2026年6月9日 21:35:28
 * @Description 3014. 输入单词需要的最少按键次数 I
 */
public class LeetCode_3014 {
    private static int minimumPushes(String word) {
        int n = word.length(), res = 0, fact = 1;
        while (n > 8) {
            res += 8 * fact;
            n -= 8;
            ++fact;
        }
        return res + n * fact;
    }

    public static void main(String[] args) {
        System.out.println(minimumPushes("abcde"));
        System.out.println(minimumPushes("xycdefghij"));
        System.out.println(minimumPushes("abhrlngxyjkezwcm"));
    }
}
