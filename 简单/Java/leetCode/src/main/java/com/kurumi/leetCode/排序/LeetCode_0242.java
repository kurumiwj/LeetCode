package com.kurumi.leetCode.排序;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024年10月25日 上午12:14:29
 * @Description 242. 有效的字母异位词
 */
public class LeetCode_0242 {
    public boolean isAnagram(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        return String.valueOf(charS).equals(new String(charT));
    }
}
