package com.kurumi.codeThoughts.贪心._03_困难;

import java.util.Arrays;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 452. 用最少数量的箭引爆气球
 */
public class LeetCode_0452 {
    static class Solution {
        public int findMinArrowShots(int[][] points) {
            if (points.length == 0)
                return 0;
            int arrow = 1;
            Arrays.sort(points, (p1, p2) -> Integer.compare(p1[0], p2[0]));
            for (int i = 1; i < points.length; i++) {
                if (points[i][0] > points[i - 1][1])
                    arrow++;
                else {
                    points[i][1] = Integer.min(points[i][1], points[i - 1][1]);
                }
            }
            return arrow;
        }
    }
}
