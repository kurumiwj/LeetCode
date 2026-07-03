package com.kurumi.codeThoughts.图论.dfs;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 130. 被围绕的区域
 */
public class LeetCode_0130 {
    static class Solution {
        int[][] dir = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

        public void dfs(char[][] board, int x, int y) {
            board[x][y] = 'Y';
            for (int i = 0; i < 4; i++) {
                int nextX = x + dir[i][0];
                int nextY = y + dir[i][1];
                if (nextX < 0 || nextX > board.length - 1 || nextY < 0 || nextY > board[0].length - 1)
                    continue;
                if (board[nextX][nextY] == 'O')
                    dfs(board, nextX, nextY);
            }
        }

        public void solve(char[][] board) {
            int n = board.length;
            int m = board[0].length;
            for (int i = 0; i < n; i++) {
                if (board[i][0] == 'O')
                    dfs(board, i, 0);
                if (board[i][m - 1] == 'O')
                    dfs(board, i, m - 1);
            }
            for (int j = 0; j < m; j++) {
                if (board[0][j] == 'O')
                    dfs(board, 0, j);
                if (board[n - 1][j] == 'O')
                    dfs(board, n - 1, j);
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (board[i][j] == 'O')
                        board[i][j] = 'X';
                    if (board[i][j] == 'Y')
                        board[i][j] = 'O';
                }
            }
        }
    }
}
