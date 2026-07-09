package com.kurumi.leetCode.codeThoughts.贪心._02_中等;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 406. 根据身高重建队列
 */
public class LeetCode_0406 {
    static class Solution {
        public int[][] reconstructQueue(int[][] people) {
            LinkedList<int[]> queue = new LinkedList<>();
            Arrays.sort(people, (p1, p2) -> {
                if (p1[0] == p2[0])
                    return p1[1] - p2[1];
                else
                    return p2[0] - p1[0];
            });
            for (int[] p : people)
                queue.add(p[1], p);
            return queue.toArray(new int[people.length][]);
        }
    }
}
