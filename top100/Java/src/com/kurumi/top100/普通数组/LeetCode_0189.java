package com.kurumi.top100.普通数组;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午5:54:33
 * @Description 189. 轮转数组
 */
public class LeetCode_0189 {
    static class Solution {
        public void swap(int[] mat, int i, int j){
            mat[i] ^= mat[j];
            mat[j] ^= mat[i];
            mat[i] ^= mat[j];
        }

        public void reverse(int[] mat, int start, int end){
            int i = start, j = end;
            while (i < j) {
                swap(mat, i, j);
                ++i;
                --j;
            }
        }

        public void rotateRight(int[] mat, int k) {
            int step = k % mat.length;
            reverse(mat, 0, mat.length - 1);
            reverse(mat, 0, step - 1);
            reverse(mat, step, mat.length - 1);
        }

        public void rotate(int[] nums, int k) {
            int n = nums.length;
            k %= n;
            rotateRight(nums, k);
        }
    }
}
