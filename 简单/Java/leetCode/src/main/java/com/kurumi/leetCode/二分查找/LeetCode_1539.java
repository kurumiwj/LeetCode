package com.kurumi.leetCode.二分查找;

/**
 * @Author kurumi
 * @Date 2026-06-14 下午9:45:54
 * @Description 1539. 第 k 个缺失的正整数
 */
public class LeetCode_1539 {
    public int findKthPositive(int[] arr, int k) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            int step = arr[mid] - (mid + 1);
            if (step < k) i = mid + 1;
            else j = mid - 1;
        }
        return i + k;
    }
}
