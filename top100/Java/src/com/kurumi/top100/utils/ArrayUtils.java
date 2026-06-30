package com.kurumi.top100.utils;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午5:56:42
 * @Description
 */
public class ArrayUtils {
    // 交换
    public static void swap(int[] mat, int i, int j){
        mat[i] ^= mat[j];
        mat[j] ^= mat[i];
        mat[i] ^= mat[j];
    }

    // 反转
    public void reverse(int[] mat, int start, int end){
        int i = start, j = end;
        while (i < j) {
            swap(mat, i, j);
            ++i;
            --j;
        }
    }
}
