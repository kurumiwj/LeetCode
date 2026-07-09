package com.kurumi.leetCode.easy.双指针;

import java.util.Arrays;

/**
 * @Author Administrator
 * @Date 2026年6月11日 21:46:30
 * @Description 1346. 检查整数及其两倍数是否存在
 */
public class LeetCode_1346 {
    // 双指针
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int index = 0;
        while (index < arr.length) {
            for (int i = index + 1; i < arr.length; i++) {
                if (arr[i] == 2 * arr[index] || arr[index] == 2 * arr[i]) return true;
            }
            ++index;
        }
        return false;
    }
}
