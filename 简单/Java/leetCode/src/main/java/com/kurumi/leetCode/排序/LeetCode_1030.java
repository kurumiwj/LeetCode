package com.kurumi.leetCode.排序;

/**
 * @Author kurumi
 * @Date 2024年11月5日 下午11:50:31
 * @Description 1030. 距离顺序排列矩阵单元格
 */
public class LeetCode_1030 {
    int[] dr = {1, 1, -1, -1};
    int[] dc = {1, -1, -1, 1};

    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int maxDist = Math.max(rCenter, rows - 1 - rCenter) + Math.max(cCenter, cols - 1 - cCenter);
        int[][] ret = new int[rows * cols][];
        int row = rCenter, col = cCenter;
        int index = 0;
        ret[index++] = new int[]{row, col};
        for (int dist = 1; dist <= maxDist; dist++) {
            row--;
            for (int i = 0; i < 4; i++) {
                while ((i % 2 == 0 && row != rCenter) || (i % 2 != 0 && col != cCenter)) {
                    if (row >= 0 && row < rows && col >= 0 && col < cols) {
                        ret[index++] = new int[]{row, col};
                    }
                    row += dr[i];
                    col += dc[i];
                }
            }
        }
        return ret;
    }
}
