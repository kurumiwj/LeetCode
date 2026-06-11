package com.kurumi.leetCode.双指针;

/**
 * @Author Administrator
 * @Date 2026年6月11日 21:56:27
 * @Description 1385. 两个数组间的距离值
 */
public class LeetCode_1385 {
    private static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt = 0;
        for (int i = 0; i < arr1.length; i++) {
            int j = 0;
            for (; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) break;
            }
            if (j >= arr2.length) ++cnt;
        }
        return cnt;
    }
}
