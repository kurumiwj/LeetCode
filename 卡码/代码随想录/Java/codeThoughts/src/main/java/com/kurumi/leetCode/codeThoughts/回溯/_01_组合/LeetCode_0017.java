package com.kurumi.leetCode.codeThoughts.回溯._01_组合;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 17. 电话号码的字母组合
 */
public class LeetCode_0017 {
    static class Solution {
        final String[] numMap = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> res = new ArrayList<>();

        void dfs(String digits, int index, StringBuilder str) {
            if (index == digits.length()) {
                res.add(str.toString());
                return;
            }
            int digit = digits.charAt(index) - '0';
            String letter = numMap[digit];
            for (int i = 0; i < letter.length(); i++) {
                str.append(letter.charAt(i));
                dfs(digits, index + 1, str);
                str.deleteCharAt(str.length() - 1);
            }
        }

        public List<String> letterCombinations(String digits) {
            if (digits.length() == 0)
                return res;
            dfs(digits, 0, new StringBuilder(""));
            return res;
        }
    }
}
