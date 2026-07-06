package com.kurumi.leetCode.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-05 下午2:24:24
 * @Description 77. 组合
 */
public class LeetCode_0077 {
    static class Solution {
        private List<List<Integer>> res = new ArrayList<>();

        private void backtracking(int n, int k, int index, List<Integer> path) {
            if (path.size() == k) {
                res.add(new ArrayList<>(path));
                return;
            }
            for (int i = index; n - i + 1 >= k - path.size(); i++) {
                path.add(i);
                backtracking(n, k, i + 1, path);
                path.remove(path.size() - 1);
            }
        }

        public List<List<Integer>> combine(int n, int k) {
            backtracking(n, k, 1, new ArrayList<>());
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combine(4, 2));
    }
}
