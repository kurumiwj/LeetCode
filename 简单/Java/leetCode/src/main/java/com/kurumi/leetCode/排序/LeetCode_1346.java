package com.kurumi.leetCode.排序;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024年11月14日 上午12:11:45
 * @Description 1346. 检查整数及其两倍数是否存在
 */
public class LeetCode_1346 {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; ++i) {
            int left = 0, right = 0, target = 2 * arr[i];
            if (arr[i] < 0) {
                left = 0;
                right = i - 1;
            } else if (arr[i] > 0) {
                left = i + 1;
                right = arr.length - 1;
            } else {
                if (i > 0 && arr[i - 1] == 0 || i < arr.length && arr[i + 1] == 0) return true;
            }
            if (binarySearch(arr, target, left, right)) return true;
        }
        return false;
    }
    
    private boolean binarySearch(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{-20, 8, -6, -14, 0, -19, 14, 4};
        LeetCode_1346 test = new LeetCode_1346();
        System.out.println(test.checkIfExist(arr));
    }
}
