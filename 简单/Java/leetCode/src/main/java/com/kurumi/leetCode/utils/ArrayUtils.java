package com.kurumi.leetCode.utils;

/**
 * @Author Administrator
 * @Date 2026年6月12日 21:37:05
 * @Description ArrayUtils
 */
public class ArrayUtils {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
    }

    public static void print(int[][] arr) {
        for (int[] arr1 : arr) {
            print(arr1);
            System.out.println();
        }
    }
}
