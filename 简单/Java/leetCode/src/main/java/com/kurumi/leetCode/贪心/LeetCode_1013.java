package com.kurumi.leetCode.贪心;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024-10-24 下午10:55:11
 * @Description 1013. 将数组分成和相等的三个部分
 */
public class LeetCode_1013 {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total = Arrays.stream(arr).sum();
        // 和不是3的倍数
        if (total % 3 != 0) return false;
        int target = total / 3, tmp = 0, index = 0, group = 0;
        while (index < arr.length) {
            tmp += arr[index];
            if (tmp == target) {
                tmp = 0;
                ++group;
            }
            if (group == 2) break;
            ++index;
        }
        if (tmp != 0) return false;
        return index < arr.length-1;
    }
}
