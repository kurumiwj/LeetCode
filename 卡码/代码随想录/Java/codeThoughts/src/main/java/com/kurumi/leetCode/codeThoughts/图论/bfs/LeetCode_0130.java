package com.kurumi.leetCode.codeThoughts.图论.bfs;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 130. 被围绕的区域
 */
public class LeetCode_0130 {
    static class Solution {
        int[][] dir = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

        public void bfs(char[][] board, int x, int y) {
            board[x][y] = 'Y';
            Deque<Integer> q = new ArrayDeque<>();
            q.offer(x);
            q.offer(y);
            while (!q.isEmpty()) {
                x = q.poll();
                y = q.poll();
                for (int i = 0; i < 4; i++) {
                    int nextX = x + dir[i][0];
                    int nextY = y + dir[i][1];
                    if (nextX < 0 || nextX > board.length - 1 || nextY < 0 || nextY > board[0].length - 1)
                        continue;
                    if (board[nextX][nextY] == 'O') {
                        q.offer(nextX);
                        q.offer(nextY);
                        board[nextX][nextY] = 'Y';
                    }
                }
            }
        }

        public void solve(char[][] board) {
            int n = board.length;
            int m = board[0].length;
            for (int i = 0; i < n; i++) {
                if (board[i][0] == 'O')
                    bfs(board, i, 0);
                if (board[i][m - 1] == 'O')
                    bfs(board, i, m - 1);
            }
            for (int j = 0; j < m; j++) {
                if (board[0][j] == 'O')
                    bfs(board, 0, j);
                if (board[n - 1][j] == 'O')
                    bfs(board, n - 1, j);
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
