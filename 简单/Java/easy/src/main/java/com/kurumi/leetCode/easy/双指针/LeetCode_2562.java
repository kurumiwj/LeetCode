package com.kurumi.leetCode.easy.双指针;

/**
 * @Author Administrator
 * @Date 2026年6月12日 22:42:09
 * @Description 2562. 找出数组的串联值
 */
public class LeetCode_2562 {
    private static long findTheArrayConcVal(int[] nums) {
        int left = 0, right = nums.length - 1;
        long sum = 0;
        while (left < right) {
            StringBuilder sb = new StringBuilder();
            sum += Long.parseLong(sb.append(nums[left]).append(nums[right]).toString());
            ++left;
            --right;
        }
        if (left == right) sum += nums[left];
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(findTheArrayConcVal(new int[]{7, 52, 2, 4}));
        System.out.println(findTheArrayConcVal(new int[]{5, 14, 13, 8, 12}));
    }
}
