package com.kurumi.leetCode.贪心;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author Administrator
 * @Date 2026年6月9日 22:21:28
 * @Description 3487. 删除后的最大子数组元素和
 */
public class LeetCode_3487 {
    private static int maxSum1(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= 0) {
                if (i == nums.length - 1) {
                    return nums[i];
                }
                continue;
            }
            if (nums[i] < nums[i + 1]) {
                sum += nums[i];
            }
        }
        return sum + nums[nums.length - 1];
    }

    private static int maxSum2(int[] nums) {
        Set<Integer> set = new HashSet();
        int sum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (set.contains(num)) continue;
            set.add(num);
            if (num <= 0) sum = num > sum ? num : sum;
            else {
                sum = sum <= 0 ? num : sum + num;
            }
        }
        return sum;
    }

    private static int maxSum3(int[] nums) {
        boolean[] visited = new boolean[101];
        int sum = 0, max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
            if (num < 0 || visited[num]) {
                continue;
            }
            visited[num] = true;
            sum += num;
        }
        return sum == 0 ? max : sum;
    }

    public static void main(String[] args) {
        System.out.println(maxSum3(new int[]{1, 2, 3, 4, 5}));
        System.out.println(maxSum3(new int[]{1, 1, 0, 1, 1}));
        System.out.println(maxSum3(new int[]{1, 2, -1, -2, 1, 0, -1}));
    }
}
