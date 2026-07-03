package com.kurumi.codeThoughts.数组.螺旋矩阵;

/**
 * @Author kurumi
 * @Date 2026-07-01 下午10:59:43
 * @Description 59. 螺旋矩阵 II
 */
public class LeetCode_0059 {
    static class Solution {
        public int[][] generateMatrix(int n) {
            int startX = 0, startY = 0, offset = 1, count = 1;
            int loop = n / 2;
            int[][] nums = new int[n][n];
            while (loop-- > 0) {
                int i = startX, j = startY;
                for (j = startY; j < n - offset; j++)
                    nums[i][j] = count++;
                for (i = startX; i < n - offset; i++)
                    nums[i][j] = count++;
                for (; j > startY; j--)
                    nums[i][j] = count++;
                for (; i > startX; i--)
                    nums[i][j] = count++;
                startX++;
                startY++;
                offset++;
            }
            if (n % 2 != 0)
                nums[n / 2][n / 2] = count;
            return nums;
        }

        public void printNums(int[][] nums) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++)
                    System.out.print(nums[i][j] + " ");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = solution.generateMatrix(5);
        solution.printNums(nums);
    }
}