package com.kurumi.leetCode.排序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * @Author kurumi
 * @Date 2024年11月13日 上午12:16:39
 * @Description 1337. 矩阵中战斗力最弱的 K 行
 */
public class LeetCode_1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<Integer> nums = IntStream.range(0, mat.length)
            .map(index -> Arrays.stream(mat[index]).sum())
            .boxed()
            .toList();
        HashMap<Integer, Integer> map = IntStream.range(0, nums.size())
            .collect(HashMap::new, (m, index) -> m.put(index, nums.get(index)), HashMap::putAll);
        return new ArrayList<>(map.entrySet()).stream()
            .sorted((a, b) -> Integer.compare(a.getValue(), b.getValue()))
            .limit(k)
            .mapToInt(Map.Entry::getKey)
            .toArray();
    }
}
