package com.kurumi.leetCode.easy.二分查找;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-06-21 下午8:11:42
 * @Description 2824. 统计和小于目标的下标对数目
 */
public class LeetCode_2824 {
    private static int binarySearch(List<Integer> nums, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums.get(mid) >= target) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return start;
    }

    private static int countPairs(List<Integer> nums, int target) {
        int res = 0;
        Collections.sort(nums);
        for (int i = 1; i < nums.size(); ++i) {
            int index = binarySearch(nums, 0, i - 1, target - nums.get(i));
            res += index;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countPairs(Arrays.asList(-1, 1, 2, 3, 1), 2));
        System.out.println(countPairs(Arrays.asList(-6,2,5,-2,-7,-1,3), -2));
    }
}
