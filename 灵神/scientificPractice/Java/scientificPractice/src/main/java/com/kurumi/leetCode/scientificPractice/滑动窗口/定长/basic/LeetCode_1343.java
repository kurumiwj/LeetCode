package com.kurumi.leetCode.scientificPractice.滑动窗口.定长.basic;

/**
 * @Author kurumi
 * @Date 2026-06-22 下午8:36:55
 * @Description 1343. 大小为 K 且平均值大于等于阈值的子数组数目
 */
public class LeetCode_1343 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0, right = 0, sum = 0, cnt = 0, target = threshold * k;
        while (right - left < k - 1) {
            sum += arr[right];
            ++right;
        }
        while (right < arr.length) {
            sum += arr[right++];
            if (sum >= target) ++cnt;
            sum -= arr[left++];
        }
        return cnt;
    }
}
