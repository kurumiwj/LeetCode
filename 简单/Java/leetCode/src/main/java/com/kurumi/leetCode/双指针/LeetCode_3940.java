package com.kurumi.leetCode.双指针;

import java.util.Arrays;

/**
 * @Author Administrator
 * @Date 2026年6月13日 17:52:22
 * @Description 3940. 限制有序数组中的元素出现次数
 */
public class LeetCode_3940 {
    private static int[] limitOccurrences(int[] nums, int k) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        int i = 1, cnt = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[j - 1]) ++cnt;
            else cnt = 1;
            if (cnt <= k) {
                res[i++] = nums[j];
            }
        }
        return Arrays.copyOfRange(res, 0, i);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(limitOccurrences(new int[]{1, 1, 1, 2, 2, 3}, 2)));
        System.out.println(Arrays.toString(limitOccurrences(new int[]{1, 2, 3}, 1)));
    }
}
