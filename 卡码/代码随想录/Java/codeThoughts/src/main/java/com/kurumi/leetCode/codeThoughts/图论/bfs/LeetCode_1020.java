package com.kurumi.leetCode.codeThoughts.图论.bfs;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 1020. 飞地的数量
 */
public class LeetCode_1020 {
    static class Solution {
        int cnt;
        int[][] dir = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

        public void bfs(int[][] grid, int x, int y) {
            grid[x][y] = 0;
            cnt++;
            Deque<Integer> q = new ArrayDeque<>();
            q.offer(x);
            q.offer(y);
            while (!q.isEmpty()) {
                x = q.poll();
                y = q.poll();
                for (int i = 0; i < 4; i++) {
                    int nextX = x + dir[i][0];
                    int nextY = y + dir[i][1];
                    if (nextX < 0 || nextX > grid.length - 1 || nextY < 0 || nextY > grid[0].length - 1)
                        continue;
                    if (grid[nextX][nextY] == 1) {
                        cnt++;
                        grid[nextX][nextY] = 0;
                        q.offer(nextX);
                        q.offer(nextY);
                    }
                }
            }
        }

        public int numEnclaves(int[][] grid) {
            int n = grid.length;
            int m = grid[0].length;
            for (int i = 0; i < n; i++) {
                if (grid[i][0] == 1)
                    bfs(grid, i, 0);
                if (grid[i][m - 1] == 1)
                    bfs(grid, i, m - 1);
            }
            for (int j = 0; j < m; j++) {
                if (grid[0][j] == 1)
                    bfs(grid, 0, j);
                if (grid[n - 1][j] == 1)
                    bfs(grid, n - 1, j);
            }
            cnt = 0;
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    if (grid[i][j] == 1)
                        bfs(grid, i, j);
            return cnt;
        }
    }
}
