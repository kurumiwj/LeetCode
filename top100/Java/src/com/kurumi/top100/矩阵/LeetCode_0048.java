package com.kurumi.top100.矩阵;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午5:59:36
 * @Description 48. 旋转图像
 */
public class LeetCode_0048 {
    static class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if (i != j) {
                        matrix[i][j] ^= matrix[j][i];
                        matrix[j][i] ^= matrix[i][j];
                        matrix[i][j] ^= matrix[j][i];
                    }
                }
            }
            for (int j = 0; j < n / 2; j++) {
                for (int i = 0; i < n; i++) {
                    matrix[i][j] ^= matrix[i][n - 1 - j];
                    matrix[i][n - 1 - j] ^= matrix[i][j];
                    matrix[i][j] ^= matrix[i][n - 1 - j];
                }
            }
        }
    }
}
