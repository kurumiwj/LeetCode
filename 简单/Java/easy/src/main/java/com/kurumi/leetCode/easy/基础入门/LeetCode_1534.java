package com.kurumi.leetCode.easy.基础入门;

/**
 * @Author kurumi
 * @Date 2026-07-09 下午11:19:05
 * @Description 1534. 统计好三元组
 */
public class LeetCode_1534 {
    static class Solution {
        public int countGoodTriplets(int[] arr, int a, int b, int c) {
            int cnt = 0;
            for (int k = 2; k < arr.length; k++) {
                for (int j = 1; j < k; j++) {
                    for (int i = 0; i < j; i++) {
                        if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[i] - arr[k]) <= c && Math.abs(arr[j] - arr[k]) <= b) ++cnt;
                    }
                }
            }
            return cnt;
        }
    }

    static class Solution1 {
        public int countGoodTriplets(int[] arr, int a, int b, int c) {
            int cnt = 0;
            for (int i = 0; i < arr.length - 2; i++) {
                for (int j = i + 1; j < arr.length - 1; j++) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[i] - arr[k]) <= c && Math.abs(arr[j] - arr[k]) <= b) ++cnt;
                    }
                }
            }
            return cnt;
        }
    }
}
