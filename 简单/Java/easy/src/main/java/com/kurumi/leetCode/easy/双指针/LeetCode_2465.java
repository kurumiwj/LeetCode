package com.kurumi.leetCode.easy.双指针;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author Administrator
 * @Date 2026年6月12日 21:47:59
 * @Description 2465. 不同的平均值数目
 */
public class LeetCode_2465 {
    private static int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        Set<Integer> set = new HashSet<>();
        while (left < right) {
            set.add(nums[left] + nums[right]);
            ++left;
            --right;
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(distinctAverages(new int[]{9, 5, 7, 8, 7, 9, 8, 2, 0, 7}));
        System.out.println(distinctAverages(new int[]{15, 77, 97, 26, 53, 41, 26, 13, 12, 18, 17, 42, 13, 33, 34, 70, 48, 65, 62, 78, 33, 60, 96, 53, 23, 14, 60, 70, 57, 41, 29, 12, 79, 65, 52, 30}));
    }
}
