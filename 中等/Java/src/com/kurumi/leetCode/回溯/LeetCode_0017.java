package com.kurumi.leetCode.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-05 下午1:08:22
 * @Description 17. 电话号码的字母组合
 */
public class LeetCode_0017 {
    static class Solution {
        private List<String> numbers = List.of("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");
        private List<String> res = new ArrayList<>();

        private void backtracking(StringBuilder builder, int index, String digits) {
            if (index == digits.length()) {
                res.add(builder.toString());
                return;
            }
            String number = numbers.get(digits.charAt(index) - '0');
            for (char ch : number.toCharArray()) {
                builder.append(ch);
                backtracking(builder, index + 1, digits);
                builder.deleteCharAt(index);
            }
        }

        public List<String> letterCombinations(String digits) {
            int n = digits.length();
            if (n == 0) return res;
            StringBuilder builder = new StringBuilder();
            backtracking(builder, 0, digits);
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations("23"));
    }
}
