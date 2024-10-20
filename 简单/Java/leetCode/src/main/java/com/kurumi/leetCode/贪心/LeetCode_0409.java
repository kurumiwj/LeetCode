/**
 * @Author: kurumiwj
 * @Date: 2024-10-20 17:48:49
 * @Description: 409. 最长回文串
 */
package com.kurumi.leetCode.贪心;

public class LeetCode_0409 {
    public int longestPalindrome(String s) {
        int res = 0;
        int[] cnt = new int[128];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i)]++;
        }
        for (int num : cnt) {
            if (num > 0) {
                res += num / 2 * 2;
                // 碰到第一个奇数
                if (num % 2 == 1 && res % 2 == 0)
                    res++;
            }
        }
        return res;
    }
}
