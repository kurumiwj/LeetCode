package com.kurumi.leetCode.二分查找;

/**
 * @Author kurumi
 * @Date 2026-06-14 下午9:29:37
 * @Description 1351. 统计有序矩阵中的负数
 */
public class LeetCode_1351 {
    private static int countNegatives(int[] mat) {
        int i = 0, j = mat.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (mat[mid] < 0) j = mid - 1;
            else i = mid + 1;
        }
        return mat.length - i;
    }

    private static int countNegatives(int[][] grid) {
        int cnt = 0;
        for (int[] m : grid) {
            cnt += countNegatives(m);
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(countNegatives(new int[][] {new int[] {3, 2}, new int[] {1, 0}}));
    }
}
