package com.kurumi.leetCode.排序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2024年11月11日 上午12:45:56
 * @Description 1200. 最小绝对差
 */
public class LeetCode_1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().sorted(Integer::compare).toList();
        int minDiff = 2000000;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; ++i) {
            minDiff = Math.min(minDiff, list.get(i+1) - list.get(i));
        }
        for (int i = 0; i < list.size() - 1; ++i) {
            int diff = list.get(i + 1) - list.get(i);
            if (diff == minDiff) {
                res.add(List.of(list.get(i), list.get(i + 1)));
            }
        }
        return res;
    }
}
