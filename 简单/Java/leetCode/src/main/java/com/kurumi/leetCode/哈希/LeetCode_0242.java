package com.kurumi.leetCode.哈希;

/**
 * @Author kurumi
 * @Date 2024年11月19日 上午12:06:04
 * @Description 242. 有效的字母异位词
 */
public class LeetCode_0242 {
    public boolean isAnagram(String s, String t) {
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            hash[t.charAt(i) - 'a']--;
        }
        for (int i : hash) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
