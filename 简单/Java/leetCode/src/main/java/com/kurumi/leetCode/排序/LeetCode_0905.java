package com.kurumi.leetCode.排序;

/**
 * @Author kurumi
 * @Date 2024年11月3日 下午2:29:01
 * @Description 905. 按奇偶排序数组
 */
public class LeetCode_0905 {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            while (left < nums.length && (nums[left] & 1) == 0) ++left;   // 从左到右偶数则排好序
            while (right >= 0 && (nums[right] & 1) == 1) --right; // 从右到左奇数则排好序
            if (left < right) {
                nums[left] ^= nums[right];
                nums[right] ^= nums[left];
                nums[left] ^= nums[right];
                ++left;
                --right;
            }
        }
        return nums;
    }
}
