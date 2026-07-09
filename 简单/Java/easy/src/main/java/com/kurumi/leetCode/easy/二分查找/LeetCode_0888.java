package com.kurumi.leetCode.easy.二分查找;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-06-14 下午3:06:29
 * @Description 888. 公平的糖果交换
 */
public class LeetCode_0888 {
    private static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = Arrays.stream(aliceSizes).sum();
        int sumB = Arrays.stream(bobSizes).sum();
        int target = (sumA - sumB) / 2;
        Arrays.sort(bobSizes);
        for (int numA : aliceSizes) {
            int numB = numA - target;
            int index = Arrays.binarySearch(bobSizes, numB);
            if (index >= 0) return new int[] {numA, numB};
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fairCandySwap(new int[] {35,17,4,24,10}, new int[] {63,21})));
    }
}
