package com.kurumi.leetCode.排序;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024年10月27日 上午12:57:56
 * @Description 389. 找不同
 */
public class LeetCode_0389 {
    public char findTheDifference(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        for (int i = 0; i < sChars.length; ++i) {
            if (sChars[i] != tChars[i]) return tChars[i];
        }
        return tChars[tChars.length-1];
    }
}
