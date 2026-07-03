package com.kurumi.codeThoughts.图论.bfs;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description LeetCode_0463
 */
public class LeetCode_0463 {
    static class Solution {
        int[][] dir = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

        public int islandPerimeter(int[][] grid) {
            int n = grid.length;
            int m = grid[0].length;
            int res = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == 1) {
                        for (int k = 0; k < 4; k++) {
                            int x = i + dir[k][0];
                            int y = j + dir[k][1];
                            if (x < 0 || x > n - 1 || y < 0 || y > m - 1 || grid[x][y] == 0)
                                res++;
                        }
                    }
                }
            }
            return res;
        }
    }
}
