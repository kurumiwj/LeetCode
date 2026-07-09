package com.kurumi.leetCode.easy.双指针;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-06-13 下午3:06:08
 * @Description 2903. 找出满足差值条件的下标 I
 */
public class LeetCode_2903 {
    private static int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int i = 0;
        int[] res = {-1, -1};
        while (i < nums.length - indexDifference) {
            for (int j = i + indexDifference; j < nums.length; j++) {
                if (Math.abs(nums[j] - nums[i]) >= valueDifference) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
            ++i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findIndices(new int[]{5, 1, 4, 1}, 2, 4)));
        System.out.println(Arrays.toString(findIndices(new int[]{2, 1}, 0, 0)));
    }
}
