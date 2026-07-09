package com.kurumi.leetCode.easy.双指针;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Administrator
 * @Date 2026年6月11日 22:31:30
 * @Description 2200. 找出数组中的所有 K 近邻下标
 */
public class LeetCode_2200 {
    private static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();
        int lastKIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                int start = Math.max(i - k, lastKIndex);
                int end = Math.min(i + k, nums.length - 1);
                while (start <= end) {
                    res.add(start++);
                    lastKIndex = start;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findKDistantIndices(new int[]{3, 4, 9, 1, 3, 9, 5}, 9, 1));
        System.out.println(findKDistantIndices(new int[]{2, 2, 2, 2, 2}, 2, 2));
    }
}
