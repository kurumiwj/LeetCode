package com.kurumi.leetCode.codeThoughts.回溯._03_子集;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 90. 子集 II
 */
public class LeetCode_0090 {
    static class Solution {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new LinkedList<>();

        public void backtracking(int[] nums, int index) {
            res.add(new ArrayList(path));
            if (index >= nums.length)
                return;
            for (int i = index; i < nums.length; i++) {
                if (i > index && nums[i] == nums[i - 1])
                    continue;
                path.offer(nums[i]);
                backtracking(nums, i + 1);
                path.removeLast();
            }
        }

        public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            backtracking(nums, 0);
            return res;
        }
    }
}
