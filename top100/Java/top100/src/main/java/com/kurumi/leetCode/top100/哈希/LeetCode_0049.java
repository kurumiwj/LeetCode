package com.kurumi.leetCode.top100.哈希;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午5:46:50
 * @Description 49. 字母异位词分组
 */
public class LeetCode_0049 {
    static class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();
            for (String str : strs) {
                char[] arr = str.toCharArray();
                Arrays.sort(arr);
                map.computeIfAbsent(new String(arr), k -> new ArrayList<>()).add(str);
            }
            return new ArrayList<>(map.values());
        }
    }
}
