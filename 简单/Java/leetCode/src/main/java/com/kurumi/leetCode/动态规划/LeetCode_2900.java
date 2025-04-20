package com.kurumi.leetCode.动态规划;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kurumi
 * @Date: 2025-04-20 17:48:19
 * @Description: 2900. 最长相邻不相等子序列 I
 */
public class LeetCode_2900 {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> res = new ArrayList<>();
        res.add(words[0]);
        for (int i = 1; i < groups.length; i++) {
            if (groups[i] != groups[i - 1]) {
                res.add(words[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words = { "a", "b", "c", "d" };
        int[] groups = { 1, 0, 1, 1 };
        LeetCode_2900 test = new LeetCode_2900();
        System.out.println(test.getLongestSubsequence(words, groups));
    }
}
