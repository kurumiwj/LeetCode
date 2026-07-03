package com.kurumi.codeThoughts.哈希._01_有效字母异位词;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 242. 有效的字母异位词
 */
public class LeetCode_0242 {
    static class Solution {
        public boolean isAnagram(String s, String t) {
            int[] hash = new int[26];
            for (int i = 0; i < s.length(); i++)
                hash[s.charAt(i) - 'a']++;
            for (int i = 0; i < t.length(); i++)
                hash[t.charAt(i) - 'a']--;
            for (int i : hash)
                if (i != 0)
                    return false;
            return true;
        }
    }
}
