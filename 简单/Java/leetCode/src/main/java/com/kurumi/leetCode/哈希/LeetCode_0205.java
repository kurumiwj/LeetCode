package com.kurumi.leetCode.哈希;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author kurumi
 * @Date 2024年11月18日 上午12:13:14
 * @Description 205. 同构字符串
 */
public class LeetCode_0205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> a = new HashMap<>();
        Map<Character, Character> b = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            char ch1 = s.charAt(i), ch2 = t.charAt(i);
            if ((a.containsKey(ch1) && a.get(ch1) != ch2) || b.containsKey(ch2) && b.get(ch2) != ch1) return false;
            a.put(ch1, ch2);
            b.put(ch2, ch1);
        }
        return true;
    }
}
