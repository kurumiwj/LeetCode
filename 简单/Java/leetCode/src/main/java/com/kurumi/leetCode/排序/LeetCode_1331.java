package com.kurumi.leetCode.排序;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author kurumi
 * @Date 2024年11月13日 上午12:10:22
 * @Description 1331. 数组序号转换
 */
public class LeetCode_1331 {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortedArr = Arrays.copyOfRange(arr, 0, arr.length);
        Arrays.sort(sortedArr);
        Map<Integer, Integer> rank = new HashMap<>();
        Arrays.stream(sortedArr).forEach(num -> {
            if (!rank.containsKey(num)) {
                rank.put(num, rank.size() + 1);
            }
        });
        int[] res = new int[arr.length];
        int index = 0;
        for (int num : arr) {
            res[index++] = rank.get(num);
        }
        return res;
    }
}
