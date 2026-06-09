package com.kurumi.leetCode.贪心;

/**
 * @Author Administrator
 * @Date 2026年6月9日 21:03:17
 * @Description 2656. K 个元素的最大和
 */
public class LeetCode_2656 {
    private static int maximizeSum(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(num, max);
        }
        return k * max + (k - 1) * k / 2;
    }

    public static void main(String[] args) {
        System.out.println(maximizeSum(new int[]{1, 2, 3, 4, 5}, 3));
        System.out.println(maximizeSum(new int[]{5, 5, 5}, 2));
    }
}
