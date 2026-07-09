package com.kurumi.leetCode.scientificPractice.滑动窗口.定长.basic;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-06-22 下午8:41:55
 * @Description 2090. 半径为 k 的子数组平均值
 */
public class LeetCode_2090 {
    private static int[] getAverages(int[] nums, int k) {
        int i = 0, j = 0, index = k;
        long sum = 0;
        int[] avg = new int[nums.length];
        Arrays.fill(avg, -1);
        while (j < index + k && j < nums.length) {
            sum += nums[j++];
        }
        while (j < nums.length) {
            sum += nums[j++];
            avg[index++] = (int) (sum / (2 * k + 1));
            sum -= nums[i++];
        }
        return avg;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getAverages(new int[] {7,4,3,9,1,8,5,2,6}, 3)));
        System.out.println(Arrays.toString(getAverages(new int[] {100000}, 0)));
        System.out.println(Arrays.toString(getAverages(new int[] {8}, 100000)));
    }
}
