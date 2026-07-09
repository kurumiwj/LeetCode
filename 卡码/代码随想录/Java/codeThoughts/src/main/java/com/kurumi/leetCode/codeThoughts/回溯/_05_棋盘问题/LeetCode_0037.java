package com.kurumi.leetCode.codeThoughts.回溯._05_棋盘问题;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 37. 解数独
 */
public class LeetCode_0037 {
    static class Solution {
        public boolean isValid(int row, int col, char ch, char[][] board) {
            for (int i = 0; i < 9; i++)
                if (board[row][i] == ch || board[i][col] == ch)
                    return false;
            int startRow = (row / 3) * 3;
            int startCol = (col / 3) * 3;
            for (int i = startRow; i < startRow + 3; i++)
                for (int j = startCol; j < startCol + 3; j++)
                    if (board[i][j] == ch)
                        return false;
            return true;
        }

        public boolean backtracking(char[][] board) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] == '.') {
                        for (char k = '1'; k <= '9'; k++) {
                            if (isValid(i, j, k, board)) {
                                board[i][j] = k;
                                if (backtracking(board))
                                    return true;
                                board[i][j] = '.';
                            }
                        }
                        return false;
                    }
                }
            }
            return true;
        }

        public void solveSudoku(char[][] board) {
            backtracking(board);
        }
    }
}
