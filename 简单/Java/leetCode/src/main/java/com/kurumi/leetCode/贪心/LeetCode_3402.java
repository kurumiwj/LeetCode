package com.kurumi.leetCode.贪心;

/**
 * @Author Administrator
 * @Date 2026年6月9日 22:15:29
 * @Description 3402. 使每一列严格递增的最少操作次数
 */
public class LeetCode_3402 {
    private static int minimumOperations(int[][] grid) {
        int m = grid.length, n = grid[0].length, res = 0;
        for (int i = 0; i < n; i++) {
            int start = 1;
            while (start < m) {
                if (grid[start][i] <= grid[start-1][i]) {
                    res += grid[start-1][i] - grid[start][i] + 1;
                    grid[start][i] = grid[start-1][i] + 1;
                }
                ++start;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][] {
            new int[]{3, 2},
            new int[]{1, 3},
            new int[]{3, 4},
            new int[]{0, 1}
        };
        System.out.println(minimumOperations(grid));
        grid = new int[][]{
            new int[]{3, 2, 1},
            new int[]{2, 1, 0},
            new int[]{1, 2, 3}
        };
        System.out.println(minimumOperations(grid));
    }
}
