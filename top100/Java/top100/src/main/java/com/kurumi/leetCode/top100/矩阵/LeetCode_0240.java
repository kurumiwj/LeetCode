package com.kurumi.leetCode.top100.矩阵;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午6:00:03
 * @Description 240. 搜索二维矩阵 II
 */
public class LeetCode_0240 {
    static class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length, n = matrix[0].length, i = 0, j = n - 1;
            while (i < m && j >= 0) {
                if (matrix[i][j] > target)
                    --j;
                else if (matrix[i][j] < target)
                    ++i;
                else
                    return true;
            }
            return false;
        }
    }
}
