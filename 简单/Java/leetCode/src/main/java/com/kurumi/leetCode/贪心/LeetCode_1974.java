package com.kurumi.leetCode.贪心;

/**
 * @Author Administrator
 * @Date 2026年6月7日 20:13:39
 * @Description 1974. 使用特殊打字机键入单词的最少时间
 */
public class LeetCode_1974 {
    private static int minTimeToType(String word) {
        int type = word.length();
        int res = 0;
        char start = 'a';
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int interval = Math.abs(ch - start);
            if (interval <= 13) res += interval;
            else res += 26 - interval;
            start = ch;
        }
        return res + type;
    }

    public static void main(String[] args) {
        System.out.println(minTimeToType("abc"));
        System.out.println(minTimeToType("bza"));
    }
}
