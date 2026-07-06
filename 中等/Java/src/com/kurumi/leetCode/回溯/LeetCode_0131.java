package com.kurumi.leetCode.回溯;

import java.util.ArrayList;
import java.util.List;

import com.kurumi.leetCode.utils.StringUtils;

/**
 * @Author kurumi
 * @Date 2026-07-05 下午1:44:38
 * @Description LeetCode_0078.java
 */
public class LeetCode_0131 {
    static class Solution {
        private List<List<String>> res = new ArrayList<>();

        private void backtracking(int index, String s, List<String> path) {
            if (index == s.length()) {
                res.add(new ArrayList<>(path));
                return;
            }
            for (int i = index; i < s.length(); i++) {
                String str = s.substring(index, i + 1);
                if (StringUtils.isPalindrome(str)) {
                    path.add(str);
                    backtracking(i + 1, s, path);
                    path.remove(path.size() - 1);
                }
            }
        }

        public List<List<String>> partition(String s) {
            backtracking(0, s, new ArrayList<>());
            return res;
        }
    }

    static class Solution1 {
        private List<List<String>> res = new ArrayList<>();

        private void backtracking(int index, int start, String s, List<String> path) {
            if (index == s.length()) {
                res.add(new ArrayList<>(path));
                return;
            }
            if (index < s.length() - 1)
                backtracking(index + 1, start, s, path);
            String str = s.substring(start, index + 1);
            if (StringUtils.isPalindrome(str)) {
                path.add(str);
                backtracking(index + 1, index + 1, s, path);
                path.remove(path.size() - 1);
            }
        }

        public List<List<String>> partition(String s) {
            backtracking(0, 0, s, new ArrayList<>());
            return res;
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.partition("aab"));
    }
}
