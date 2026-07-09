package com.kurumi.leetCode.codeThoughts.贪心._01_简单;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 1005. K 次取反后最大化的数组和
 */
public class LeetCode_1005 {
    static class Solution {
        public int largestSumAfterKNegations(int[] nums, int k) {
            nums = IntStream.of(nums).boxed().sorted((x, y) -> -Integer.compare(Math.abs(x), Math.abs(y))).mapToInt(Integer::intValue).toArray();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < 0 && k > 0) {
                    nums[i] = -nums[i];
                    k--;
                }
            }
            if (k % 2 == 1)
                nums[nums.length - 1] = -nums[nums.length - 1];
            return Arrays.stream(nums).sum();
        }
    }
}
