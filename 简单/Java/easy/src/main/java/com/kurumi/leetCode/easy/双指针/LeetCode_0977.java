package com.kurumi.leetCode.easy.双指针;

/**
 * @Author Administrator
 * @Date 2026年6月11日 20:24:41
 * @Description 977. 有序数组的平方
 */
public class LeetCode_0977 {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0, right = nums.length - 1, index = nums.length - 1;
        while (left <= right) {
            int leftPow = nums[left] * nums[left], rightPow = nums[right] * nums[right];
            if (leftPow < rightPow) {
                res[index--] = rightPow;
                --right;
            } else {
                res[index--] = leftPow;
                ++left;
            }
        }
        return res;
    }
}
