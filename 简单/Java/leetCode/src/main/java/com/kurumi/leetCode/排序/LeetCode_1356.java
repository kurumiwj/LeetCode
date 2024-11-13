package com.kurumi.leetCode.排序;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author kurumi
 * @Date 2024年11月14日 上午12:37:24
 * @Description 1356. 根据数字二进制下 1 的数目排序
 */
public class LeetCode_1356 {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr)
            .boxed()
            .sorted(Comparator.comparingInt(Integer::bitCount)
                .thenComparingInt(num -> num))
            .mapToInt(num -> num)
            .toArray();
    }
}
