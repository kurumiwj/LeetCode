package com.kurumi.leetCode.easy.基础入门;

/**
 * @Author kurumi
 * @Date 2026-07-10 上午12:17:37
 * @Description 867. 转置矩阵
 */
public class LeetCode_0867 {
    static class Solution {
        public int[][] transpose(int[][] matrix) {
            int m = matrix.length, n = matrix[0].length;
            int[][] res = new int[n][m];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    res[j][i] = matrix[i][j];
                }
            }
            return res;
        }
    }
}
