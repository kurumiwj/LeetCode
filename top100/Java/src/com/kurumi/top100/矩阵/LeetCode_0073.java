package com.kurumi.top100.矩阵;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午5:58:32
 * @Description 73. 矩阵置零
 */
public class LeetCode_0073 {
    static class Solution {
        public void setZeroes(int[][] matrix) {
            int m = matrix.length, n = matrix[0].length;
            boolean firstRowZero = false;
            for (int j = 0; j < n; j++) {
                if (matrix[0][j] == 0) {
                    firstRowZero = true;
                    break;
                }
            }
            for (int i = 1; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
            for (int i = 1; i < m; i++) {
                for (int j = n - 1; j >= 0; j--) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
            if (firstRowZero) {
                for (int j = 0; j < n; j++) {
                    matrix[0][j] = 0;
                }
            }
        }
    }
}
