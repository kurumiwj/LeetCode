package com.kurumi.leetCode.排序;

/**
 * @Author kurumi
 * @Date 2024-11-03 14:42:11
 * @Description 922. 按奇偶排序数组 II
 */
public class LeetCode_0922 {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length, odd = 1;
        for (int even = 0; even < n; even += 2) {
            if ((nums[even] & 1) == 1) {    // 偶数索引为奇数
                while ((nums[odd] & 1) == 1) odd += 2; // 奇数索引为奇数
                nums[even] ^= nums[odd];
                nums[odd] ^= nums[even];
                nums[even] ^= nums[odd];
            }
        }
        return nums;
    }
}
