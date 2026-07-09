package com.kurumi.leetCode.codeThoughts.回溯._01_组合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 40. 组合总和 II
 */
public class LeetCode_0040 {
    static class Solution {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        public void backtracking(int[] candidates, int target, int sum, int index) {
            if (sum == target) {
                res.add(new ArrayList(path));
                return;
            }
            for (int i = index; i < candidates.length && sum + candidates[i] <= target; i++) {
                if (i > index && candidates[i] == candidates[i - 1])
                    continue;
                path.add(candidates[i]);
                backtracking(candidates, target, sum + candidates[i], i + 1);
                path.remove(path.size() - 1);
            }
        }

        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            backtracking(candidates, target, 0, 0);
            return res;
        }
    }
}
