package com.kurumi.codeThoughts.回溯._02_分割;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 131. 分割回文串
 */
public class LeetCode_0131 {
    static class Solution {
        Deque<String> path = new LinkedList<>();
        List<List<String>> res = new ArrayList();

        public boolean isPalindrome(String str, int start, int end) {
            while (start < end) {
                if (str.charAt(start) != str.charAt(end))
                    return false;
                start++;
                end--;
            }
            return true;
        }

        public void backtracking(String s, int index) {
            if (index >= s.length()) {
                res.add(new ArrayList<>(path));
                return;
            }
            for (int i = index; i < s.length(); i++) {
                if (isPalindrome(s, index, i)) {
                    path.offer(s.substring(index, i + 1));
                } else
                    continue;
                backtracking(s, i + 1);
                path.removeLast();
            }
        }

        public List<List<String>> partition(String s) {
            backtracking(s, 0);
            return res;
        }
    }
}
