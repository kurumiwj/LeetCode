package com.kurumi.leetCode.二分查找;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-06-14 下午4:06:11
 * @Description 1346. 检查整数及其两倍数是否存在
 */
public class LeetCode_1346 {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; ++i) {
            int index = 0;
            if (arr[i] >= 0) index = Arrays.binarySearch(arr, i + 1, arr.length, arr[i] * 2);
            else {
                if (arr[i] % 2 == 0) index = Arrays.binarySearch(arr, i + 1, arr.length, arr[i] / 2);
                else continue;
            }
            if (index > 0) return true;
        }
        return false;
    }
}
