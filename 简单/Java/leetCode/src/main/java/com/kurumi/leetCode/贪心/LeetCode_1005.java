package com.kurumi.leetCode.贪心;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @Author kurumi
 * @Date 2024-10-24 下午10:39:54
 * @Description 1005. K 次取反后最大化的数组和
 */
public class LeetCode_1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        nums = IntStream.of(nums).boxed().sorted((x, y) -> -Integer.compare(Math.abs(x), Math.abs(y)))
                .mapToInt(Integer::intValue).toArray();
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
