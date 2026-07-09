package com.kurumi.leetCode.codeThoughts.图论.bfs;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 200. 岛屿数量
 */
public class LeetCode_0200 {
    static class Solution {
        int[][] dir = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

        public void bfs(char[][] grid, int x, int y) {
            grid[x][y] = '0';
            Deque<int[]> q = new ArrayDeque<>();
            q.offer(new int[] { x, y });
            while (!q.isEmpty()) {
                int[] v = q.pollFirst();
                for (int i = 0; i < 4; i++) {
                    int nextX = v[0] + dir[i][0];
                    int nextY = v[1] + dir[i][1];
                    if (nextX < 0 || nextX >= grid.length || nextY < 0 || nextY >= grid[0].length)
                        continue;
                    if (grid[nextX][nextY] == '1') {
                        grid[nextX][nextY] = '0';
                        bfs(grid, nextX, nextY);
                    }
                }
            }
        }

        public int numIslands(char[][] grid) {
            int n = grid.length;
            int m = grid[0].length;
            int res = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == '1') {
                        res++;
                        bfs(grid, i, j);
                    }
                }
            }
            return res;
        }
    }
}
