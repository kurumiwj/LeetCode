package com.kurumi.leetCode.排序;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024年10月29日 上午12:55:26
 * @Description 506. 相对名次
 */
public class LeetCode_0506 {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[][] arr = new int[n][2];    // 记录分数和索引
        String[] res = new String[n];
        String[] rank3 = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        for (int i = 0; i < n; ++i) {
            arr[i][0] = score[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
        for (int i = 0; i < n; ++i) {
            if (i < 3) res[arr[i][1]] = rank3[i];
            else res[arr[i][1]] = String.valueOf(i+1);
        }
        return res;
    }
}
