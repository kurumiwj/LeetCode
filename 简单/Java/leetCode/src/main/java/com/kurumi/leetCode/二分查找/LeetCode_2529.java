package com.kurumi.leetCode.二分查找;

/**
 * @Author kurumi
 * @Date 2026-06-21 下午7:23:47
 * @Description 2529. 正整数和负整数的最大计数
 */
public class LeetCode_2529 {
    private static int maximumCount(int[] nums) {
        int leftPos = 0, leftNeg = 0, rightPos = nums.length - 1, rightNeg = nums.length - 1;
        while (leftPos <= rightPos) {
            int mid = (leftPos + rightPos) / 2;
            if (nums[mid] <= 0) leftPos = mid + 1;
            else rightPos = mid - 1;
        }
        while (leftNeg <= rightNeg) {
            int mid = (leftNeg + rightNeg) / 2;
            if (nums[mid] >= 0) rightNeg = mid - 1;
            else leftNeg = mid + 1;
        }
        return Math.max(nums.length - leftPos, leftNeg);
    }

    public static void main(String[] args) {
        System.out.println(maximumCount(new int[] {-2, -1, -1, 1, 2, 3}));
    }
}
