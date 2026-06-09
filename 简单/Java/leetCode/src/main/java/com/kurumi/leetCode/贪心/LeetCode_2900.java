package com.kurumi.leetCode.贪心;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Administrator
 * @Date 2026年6月9日 21:26:32
 * @Description 2900. 最长相邻不相等子序列 I
 */
public class LeetCode_2900 {
    private static List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> res = new ArrayList();
        res.add(words[0]);
        int index = 1;
        while (index < groups.length) {
            if (groups[index] != groups[index-1]) {
                res.add(words[index]);
            }
            ++index;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getLongestSubsequence(new String[]{"e", "a", "b"}, new int[]{0, 0, 1}));
        System.out.println(getLongestSubsequence(new String[]{"a", "b", "c", "d"}, new int[]{1, 0, 1, 1}));
    }
}
