package com.kurumi.leetCode.哈希;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author kurumi
 * @Date 2024年11月19日 上午12:16:15
 * @Description 290. 单词规律
 */
public class LeetCode_0290 {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        Map<Character, String> map = new HashMap<>();
        Map<String, Boolean> used = new HashMap<>();
        for (int i = 0; i < pattern.length(); ++i) {
            char ch = pattern.charAt(i);
            if (!map.containsKey(ch)) {
                // 该字符串已用过
                if (used.get(words[i]) != null) return false;
                map.put(ch, words[i]);
                used.put(words[i], true);
            } else {
                if (!map.get(ch).equals(words[i])) return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(new LeetCode_0290().wordPattern("abba", "dog cat cat dog"));
    }
}
