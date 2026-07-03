package com.kurumi.codeThoughts.回溯._06_其他;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 491. 非递减子序列
 */
public class LeetCode_0491 {
    static class Solution {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new LinkedList<>();

        public void backtracking(int[] nums, int index) {
            if (path.size() > 1)
                res.add(new ArrayList(path));
            boolean[] visited = new boolean[201];
            Arrays.fill(visited, false);
            for (int i = index; i < nums.length; i++) {
                if (!path.isEmpty() && nums[i] < path.getLast() || visited[nums[i] + 100])
                    continue;
                visited[nums[i] + 100] = true;
                path.offer(nums[i]);
                backtracking(nums, i + 1);
                path.removeLast();
            }
        }

        public List<List<Integer>> findSubsequences(int[] nums) {
            backtracking(nums, 0);
            return res;
        }
    }
}
