package com.kurumi.leetCode.easy.双指针;

import java.util.Arrays;

/**
 * @Author Administrator
 * @Date 2026年6月12日 21:01:22
 * @Description 2441. 与对应负数同时存在的最大正整数
 */
public class LeetCode_2441 {
    private static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == 0) return nums[right];
            else if (nums[left] + nums[right] < 0) ++left;
            else --right;
        }
        return -1;
    }

    private static int findMaxK2(int[] nums) {
        int i = 0, res = -1;
        while (i < nums.length - 1) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == 0) {
                    res = Math.max(res, Math.max(nums[j], nums[i]));
                    break;
                }
            }
            ++i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findMaxK2(new int[]{-1, 2, -3, 3}));
        System.out.println(findMaxK2(new int[]{-1, 10, 6, 7, -7, 1}));
        System.out.println(findMaxK2(new int[]{-10, 8, 6, 7, -2, -3}));
    }
}
