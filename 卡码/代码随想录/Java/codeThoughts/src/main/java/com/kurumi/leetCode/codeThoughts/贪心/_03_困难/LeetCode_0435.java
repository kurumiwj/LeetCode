package com.kurumi.leetCode.codeThoughts.贪心._03_困难;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 435. 无重叠区间
 */
public class LeetCode_0435 {
    static class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            if (intervals.length == 0)
                return 0;
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
            int res = 0;
            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i][0] < intervals[i - 1][1]) {
                    res++;
                    intervals[i][1] = Integer.min(intervals[i][1], intervals[i - 1][1]);
                }
            }
            return res;
        }
    }
}
