package com.kurumi.leetCode.codeThoughts.回溯._05_棋盘问题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 51. N 皇后
 */
public class LeetCode_0051 {
    static class Solution {
        char[][] chess;
        List<List<String>> res = new ArrayList();

        public boolean isValid(int row, int col, int n) {
            for (int i = 0; i < row; i++) {
                if (chess[i][col] == 'Q')
                    return false;
            }
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if (chess[i][j] == 'Q')
                    return false;
            }
            for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
                if (chess[i][j] == 'Q')
                    return false;
            }
            return true;
        }

        public void backtracking(int n, int row) {
            if (row == n) {
                res.add(toList());
                return;
            }
            for (int i = 0; i < n; i++) {
                if (isValid(row, i, n)) {
                    chess[row][i] = 'Q';
                    backtracking(n, row + 1);
                    chess[row][i] = '.';
                }
            }
        }

        public List<String> toList() {
            List<String> list = new ArrayList();
            for (char[] c : chess) {
                list.add(String.copyValueOf(c));
            }
            return list;
        }

        public List<List<String>> solveNQueens(int n) {
            chess = new char[n][n];
            for (char[] c : chess) {
                Arrays.fill(c, '.');
            }
            backtracking(n, 0);
            return res;
        }
    }
}
