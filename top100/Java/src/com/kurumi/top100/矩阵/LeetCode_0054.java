package com.kurumi.top100.矩阵;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午5:59:03
 * @Description 54. 螺旋矩阵
 */
public class LeetCode_0054 {
    static class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            int m = matrix.length, n = matrix[0].length, cnt = 0;
            List<Integer> res = new ArrayList<>();
            int left = 0, right = n - 1, top = 0, bottom = m - 1;
            while (cnt < m * n) {
                // 从左到右
                for (int i = left; i <= right; i++) {
                    res.add(matrix[top][i]);
                    ++cnt;
                }
                if (cnt >= m * n) break;
                ++top;
                // 从上到下
                for (int j = top; j <= bottom; j++) {
                    res.add(matrix[j][right]);
                    ++cnt;
                }
                if (cnt >= m * n) break;
                --right;
                // 从右到左
                for (int i = right; i >=left; i--) {
                    res.add(matrix[bottom][i]);
                    ++cnt;
                }
                if (cnt >= m * n) break;
                --bottom;
                // 从下到上
                for (int j = bottom; j >= top; j--) {
                    res.add(matrix[j][left]);
                    ++cnt;
                }
                if (cnt >= m * n) break;
                ++left;
            }
            return res;
        }
    }
}
