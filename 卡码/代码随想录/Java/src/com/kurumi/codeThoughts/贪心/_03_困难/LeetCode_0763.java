package com.kurumi.codeThoughts.贪心._03_困难;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 763. 划分字母区间
 */
public class LeetCode_0763 {
    static class Solution {
        public List<Integer> partitionLabels(String s) {
            List<Integer> res = new ArrayList();
            int[] hash = new int[30];
            for (int i = 0; i < s.length(); i++) {
                hash[s.charAt(i) - 'a'] = i;
            }
            int left = 0, right = 0;
            for (int i = 0; i < s.length(); i++) {
                right = Integer.max(right, hash[s.charAt(i) - 'a']);
                if (i == right) {
                    res.add(right - left + 1);
                    left = i + 1;
                }
            }
            return res;
        }
    }
}
