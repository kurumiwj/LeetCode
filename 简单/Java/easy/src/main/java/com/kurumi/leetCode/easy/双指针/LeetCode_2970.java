package com.kurumi.leetCode.easy.双指针;

/**
 * @Author kurumi
 * @Date 2026-06-13 下午3:15:43
 * @Description 2970. 统计移除递增子数组的数目 I
 */
public class LeetCode_2970 {
    private static int incremovableSubarrayCount(int[] nums) {
        int i = 0, n = nums.length;
        while (i < n - 1 && nums[i] < nums[i + 1]) ++i;
        if (i == n - 1) return n * (n + 1) / 2;
        int res = i + 2;
        for (int j = n - 1; j > 0; j--) {
            while (i >= 0 && nums[i] >= nums[j]) --i;
            res += i + 2;
            if (nums[j - 1] >= nums[j]) break;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(incremovableSubarrayCount(new int[] {1, 2, 3, 4}));
        System.out.println(incremovableSubarrayCount(new int[] {6, 5, 7, 8}));
        System.out.println(incremovableSubarrayCount(new int[] {8, 7, 6, 6}));
    }
}
