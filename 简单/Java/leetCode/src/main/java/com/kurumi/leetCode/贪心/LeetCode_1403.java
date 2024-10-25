package com.kurumi.leetCode.贪心;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2024-10-25 下午11:48:37
 * @Description 1403. 非递增顺序的最小子序列
 */
public class LeetCode_1403 {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = Arrays.stream(nums).sum();
        int tmpSum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; --i) {
            tmpSum += nums[i];
            list.add(nums[i]);
            if (tmpSum > sum - tmpSum) {
                break;
            }
        }
        return list;
    }
}
