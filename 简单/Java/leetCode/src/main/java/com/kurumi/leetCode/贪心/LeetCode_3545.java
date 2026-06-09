package com.kurumi.leetCode.贪心;

import java.util.Arrays;

/**
 * @Author Administrator
 * @Date 2026年6月9日 22:42:52
 * @Description 3545. 不同字符数量最多为 K 时的最少删除数
 */
public class LeetCode_3545 {
    private static int minDeletion(String s, int k) {
        int[] cnt = new int[30];
        char[] chs = s.toCharArray();
        int total = 0;  //记录一共多少种类字母
        for (char ch : chs) {
            if (cnt[ch-'a'] == 0) {
                ++total;
            }
            ++cnt[ch-'a'];
        }
        Arrays.sort(cnt);
        int index = 0, sum = 0;
        while (index == 0) ++index;
        for (int i = index; i < 30 - k; i++) {
            sum += cnt[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(minDeletion("abc", 2));
        System.out.println(minDeletion("aabb", 2));
        System.out.println(minDeletion("yyyzz", 1));
    }
}
