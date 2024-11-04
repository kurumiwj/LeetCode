package com.kurumi.leetCode.排序;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2024年11月5日 上午12:07:36
 * @Description 977. 有序数组的平方
 */
public class LeetCode_0977 {
    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).boxed().sorted((a, b) -> Math.abs(a) - Math.abs(b)).map(num -> num * num).mapToInt(Integer::valueOf).toArray();
    }
}
