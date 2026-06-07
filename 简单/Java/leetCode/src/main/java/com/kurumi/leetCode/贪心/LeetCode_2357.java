package com.kurumi.leetCode.贪心;

import java.util.Arrays;

/**
 * @Author Administrator
 * @Date 2026年6月7日 22:19:22
 * @Description 2357. 使数组中所有元素都等于零
 */
public class LeetCode_2357 {
    private static int minimumOperations(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        if (nums[nums.length-1] == 0) return 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] == 0) break;
            if (nums[i] != nums[i+1]) ++res;
        }
        return res + 1;
    }

    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{1, 5, 0, 3, 5}));
        System.out.println(minimumOperations(new int[]{0}));
    }
}
