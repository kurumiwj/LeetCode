package com.kurumi.leetCode.双指针;

import java.util.Arrays;

/**
 * @Author Administrator
 * @Date 2026年6月12日 21:19:27
 * @Description 2460. 对数组执行操作
 */
public class LeetCode_2460 {
    private static int[] applyOperations(int[] nums) {
        int n = nums.length, index = 0;
        int[] res = new int[n];
        for (int i = 0; i < n - 1;) {
            if (nums[i] == 0) {
                ++i;
                continue;
            }
            if (nums[i] != nums[i+1]) {
                res[index++] = nums[i];
                ++i;
            } else {
                res[index++] = 2 * nums[i];
                nums[i+1] = 0;
                i += 2;
            }
        }
        res[index] = nums[n - 1];
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(applyOperations(new int[]{1, 2, 2, 1, 1, 0})));
        System.out.println(Arrays.toString(applyOperations(new int[]{0, 1})));
    }
}
