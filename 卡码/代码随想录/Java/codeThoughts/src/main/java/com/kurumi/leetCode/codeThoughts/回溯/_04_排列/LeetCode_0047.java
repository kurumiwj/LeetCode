package com.kurumi.leetCode.codeThoughts.回溯._04_排列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 47. 全排列 II
 */
public class LeetCode_0047 {
    static class Solution {
        Deque<Integer> path = new LinkedList();
        List<List<Integer>> res = new ArrayList();
        boolean[] visited;

        public void backtracking(int[] nums) {
            if (path.size() == nums.length) {
                res.add(new ArrayList(path));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1] && visited[i - 1] == false || visited[i])
                    continue;
                visited[i] = true;
                path.offer(nums[i]);
                backtracking(nums);
                path.removeLast();
                visited[i] = false;
            }
        }

        public List<List<Integer>> permuteUnique(int[] nums) {
            visited = new boolean[nums.length];
            Arrays.fill(visited, false);
            Arrays.sort(nums);
            backtracking(nums);
            return res;
        }
    }
}
