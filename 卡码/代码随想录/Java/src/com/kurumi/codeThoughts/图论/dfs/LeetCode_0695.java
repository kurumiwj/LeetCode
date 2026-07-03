package com.kurumi.codeThoughts.图论.dfs;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 695. 岛屿的最大面积
 */
public class LeetCode_0695 {
    static class Solution {
        int[][] dir = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int cnt = 0;

        public void dfs(int[][] grid, int x, int y) {
            grid[x][y] = 0;
            for (int i = 0; i < 4; i++) {
                int nextX = x + dir[i][0];
                int nextY = y + dir[i][1];
                if (nextX < 0 || nextX > grid.length - 1 || nextY < 0 || nextY > grid[0].length - 1)
                    continue;
                if (grid[nextX][nextY] == 1) {
                    cnt++;
                    dfs(grid, nextX, nextY);
                }
            }
        }

        public int maxAreaOfIsland(int[][] grid) {
            int n = grid.length;
            int m = grid[0].length;
            int res = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == 1) {
                        cnt = 1;
                        dfs(grid, i, j);
                        res = Math.max(res, cnt);
                    }
                }
            }
            return res;
        }
    }
}
