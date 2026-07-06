package com.kurumi.leetCode.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-05 下午2:53:13
 * @Description 22. 括号生成
 */
public class LeetCode_0022 {
    static class Solution {
        private List<String> res = new ArrayList<>();

        /**
         * @param index 当前已遍历的括号数量
         * @param open  左括号数量
         * @param n    总左括号数量
         * @param sb    结果集
         */
        private void backtracking(int index, int open, int n, String str) {
            if (index == 2 * n) {
                res.add(str.toString());
                return;
            }
            if (open < n) backtracking(index + 1, open + 1, n, str + "(");
            if (index - open < open) backtracking(index + 1, open, n, str + ")");
        }

        public List<String> generateParenthesis(int n) {
            backtracking(0, 0, n, "");
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generateParenthesis(3));
    }
}
