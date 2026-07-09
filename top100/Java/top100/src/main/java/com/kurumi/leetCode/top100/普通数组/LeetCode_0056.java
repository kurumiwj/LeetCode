package com.kurumi.leetCode.top100.普通数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午5:53:57
 * @Description 56. 合并区间
 */
public class LeetCode_0056 {
    static class Solution {
        public int[][] merge(int[][] intervals) {
            if (intervals.length == 0) return new int[0][];
            Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
            List<int[]> res = new ArrayList<>();
            for (int i = 0; i < intervals.length; i++) {
                if (i == 0 || res.get(res.size() - 1)[1] < intervals[i][0]) res.add(intervals[i]);
                else res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], intervals[i][1]);
            }
            return res.toArray(new int[res.size()][]);
        }
    }
}
