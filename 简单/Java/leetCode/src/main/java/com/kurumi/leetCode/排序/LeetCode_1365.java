package com.kurumi.leetCode.排序;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author kurumi
 * @Date 2024年11月14日 上午12:46:04
 * @Description 1365. 有多少小于当前数字的数字
 */
public class LeetCode_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().sorted().toList();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = list.size() - 1; i >= 0; --i) {
            map.put(list.get(i), i);
        }
        return Arrays.stream(nums).boxed().mapToInt(num -> map.get(num)).toArray();
    }
}
