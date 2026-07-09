package com.kurumi.leetCode.basicPractice.回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-05 下午3:20:12
 * @Description 51. N 皇后
 */
public class LeetCode_0051 {
    static class Solution {
        private int[] queens;
        private boolean[] col, diag1, diag2;
        private List<List<String>> res = new ArrayList<>();

        private void backtracking(int n, int r) {
            if (r == n) {
                List<String> list = new ArrayList<>();
                for (int queen : queens) {
                    String[] row = new String[n];
                    Arrays.fill(row, ".");
                    row[queen] = "Q";
                    list.add(String.join("", row));
                }
                res.add(list);
                return;
            }
            for (int c = 0; c < n; c++) {
                int diag2Index = r - c + n - 1;
                if (!col[c] && !diag1[r + c] && !diag2[diag2Index]) {
                    col[c] = true;
                    diag1[r + c] = true;
                    diag2[diag2Index] = true;
                    queens[r] = c;
                    backtracking(n, r + 1);
                    diag2[diag2Index] = false;
                    diag1[r + c] = false;
                    col[c] = false;
                }
            }
        }

        public List<List<String>> solveNQueens(int n) {
            queens = new int[n];
            col = new boolean[n];
            diag1 = new boolean[2 * n];
            diag2 = new boolean[2 * n];
            backtracking(n, 0);
            return res;
        }
    }

    static class Solution1 {
        private char[][] chess;
        private boolean[] col, diag1, diag2;
        private List<List<String>> res = new ArrayList<>();

        private void backtracking(int n, int r) {
            if (r == n) {
                List<String> tmp = new ArrayList<>();
                for (char[] ch : chess) tmp.add(new String(ch));
                res.add(tmp);
                return;
            }
            for (int c = 0; c < n; c++) {
                int d1 = r + c, d2 = r - c + n - 1;
                if (!col[c] && !diag1[d1] && !diag2[d2]) {
                    col[c] = true;
                    diag1[d1] = true;
                    diag2[d2] = true;
                    chess[r][c] = 'Q';
                    backtracking(n, r + 1);
                    chess[r][c] = '.';
                    diag2[d2] = false;
                    diag1[d1] = false;
                    col[c] = false;
                }
            }
        }

        public List<List<String>> solveNQueens(int n) {
            col = new boolean[n];
            diag1 = new boolean[2 * n];
            diag2 = new boolean[2 * n];
            chess = new char[n][];
            for (int i = 0; i < n; i++) {
                chess[i] = new char[n];
                Arrays.fill(chess[i], '.');
            }
            backtracking(n, 0);
            return res;
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.solveNQueens(4));
    }
}
