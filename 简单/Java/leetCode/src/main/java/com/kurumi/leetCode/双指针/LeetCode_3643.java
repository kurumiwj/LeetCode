package com.kurumi.leetCode.双指针;

/**
 * @Author kurumi
 * @Date 2026-06-13 下午4:35:11
 * @Description 3643. 垂直翻转子矩阵
 */
public class LeetCode_3643 {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        if (k <= 1) return grid;
        int endLine = Math.min(grid.length - 1, x + k - 1);
        for (int i = x; i < x + k; i++) {
            if (i < endLine) {
                for (int j = y; j < y + k; j++) {
                    int tmp = grid[i][j];
                    grid[i][j] = grid[endLine][j];
                    grid[endLine][j] = tmp;
                }
                --endLine;
            }
        }
        return grid;
    }
}
