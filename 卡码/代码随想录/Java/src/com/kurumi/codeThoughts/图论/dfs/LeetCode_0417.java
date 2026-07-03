package com.kurumi.codeThoughts.图论.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 417. 太平洋大西洋水流问题
 */
public class LeetCode_0417 {
    static class Solution {
        int[][] dir = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        boolean[][][] visited;

        public void dfs(int[][] heights, int x, int y, int flag) {
            visited[flag][x][y] = true;
            for (int i = 0; i < 4; i++) {
                int nextX = x + dir[i][0];
                int nextY = y + dir[i][1];
                if (nextX < 0 || nextX > heights.length - 1 || nextY < 0 || nextY > heights[0].length - 1)
                    continue;
                if (visited[flag][nextX][nextY] || heights[nextX][nextY] < heights[x][y])
                    continue;
                dfs(heights, nextX, nextY, flag);
            }
        }

        public List<List<Integer>> pacificAtlantic(int[][] heights) {
            int n = heights.length;
            int m = heights[0].length;
            List<List<Integer>> res = new ArrayList<>();
            visited = new boolean[2][n][m];
            for (int i = 0; i < n; i++) {
                dfs(heights, i, 0, 0);
                dfs(heights, i, m - 1, 1);
            }
            for (int j = 0; j < m; j++) {
                dfs(heights, 0, j, 0);
                dfs(heights, n - 1, j, 1);
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (visited[0][i][j] && visited[1][i][j])
                        res.add(Arrays.asList(i, j));
                }
            }
            return res;
        }
    }
}
