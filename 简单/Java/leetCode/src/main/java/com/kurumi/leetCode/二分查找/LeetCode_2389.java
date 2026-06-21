package com.kurumi.leetCode.二分查找;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-06-15 下午8:22:43
 * @Description 2389. 和有限的最长子序列
 */
public class LeetCode_2389 {
    private static int[] answerQueries(int[] nums, int[] queries) {
        int[] sum = new int[nums.length], res = new int[queries.length];
        Arrays.sort(nums);
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            sum[i] += sum[i-1] + nums[i];
        }
        int index = 0;
        for (int query : queries) {
            int i = 0, j = sum.length - 1;
            while (i <= j) {
                int mid = (i + j) / 2;
                if (sum[mid] > queries[index]) j = mid - 1;
                else i = mid + 1;
            }
            res[index++] = i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(answerQueries(new int[] {4, 5, 2, 1}, new int[] {3, 10, 21})));
        System.out.println(Arrays.toString(answerQueries(new int[] {2, 3, 4, 5}, new int[] {1})));
    }
}
