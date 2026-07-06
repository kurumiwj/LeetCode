package com.kurumi.basicPractice.回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-05 下午3:08:44
 * @Description 46. 全排列
 */
public class LeetCode_0046 {
    static class Solution {
        private List<List<Integer>> res = new ArrayList<>();
        private boolean[] visited;

        private void backtracking(int[] nums, int index, List<Integer> path) {
            if (path.size() == nums.length) {
                res.add(new ArrayList<>(path));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (!visited[i]) {
                    path.add(nums[i]);
                    visited[i] = true;
                    backtracking(nums, i + 1, path);
                    visited[i] = false;
                    path.remove(path.size() - 1);
                }
            }
        }

        public List<List<Integer>> permute(int[] nums) {
            visited = new boolean[nums.length];
            Arrays.fill(visited, false);
            backtracking(nums, 0, new ArrayList<>());
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.permute(new int[] {1 ,2 ,3}));
    }
}
