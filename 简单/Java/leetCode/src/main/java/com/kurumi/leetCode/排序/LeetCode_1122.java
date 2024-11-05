package com.kurumi.leetCode.排序;

/**
 * @Author kurumi
 * @Date 2024年11月6日 上午12:07:52
 * @Description 1122. 数组的相对排序
 */
public class LeetCode_1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        int[] cnt = new int[1001];
        int max = arr1[0];
        for (int num : arr1) {
            ++cnt[num];
            max = Math.max(max, num);
        }
        int index = 0;
        for (int i : arr2) {
            while (cnt[i] > 0) {
                res[index++] = i;
                --cnt[i];
            }
        }
        for (int i = 0; i <= max; ++i) {
            while (cnt[i] > 0) {
                res[index++] = i;
                --cnt[i];
            }
        }
        return res;
    }
}
