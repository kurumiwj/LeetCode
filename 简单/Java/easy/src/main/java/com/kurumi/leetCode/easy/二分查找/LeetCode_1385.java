package com.kurumi.leetCode.easy.二分查找;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-06-14 下午9:36:38
 * @Description 1385. 两个数组间的距离值
 */
public class LeetCode_1385 {
    private static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt = 0;
        Arrays.sort(arr2);
        for (int num : arr1) {
            int start = num - d, end = num + d;
            int i = 0, j = arr2.length - 1;
            while (i <= j) {
                int mid = (i + j) / 2;
                if (arr2[mid] >= start && arr2[mid] <= end) break;
                else if (arr2[mid] < start) i = mid + 1;
                else j = mid - 1;
            }
            if (i > j) ++cnt;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(findTheDistanceValue(new int[] {4,-3,-7,0,-10}, new int[] {8}, 69));
    }
}
