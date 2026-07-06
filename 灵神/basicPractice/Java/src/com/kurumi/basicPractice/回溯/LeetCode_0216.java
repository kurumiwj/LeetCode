package com.kurumi.basicPractice.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-05 下午2:41:01
 * @Description 216. 组合总和 III
 */
public class LeetCode_0216 {
    static class Solution {
        private List<List<Integer>> res = new ArrayList<>();

        private void backtracking(int k, int n, int index, int sum, List<Integer> path) {
            if (path.size() == k) {
                if (sum == n) res.add(new ArrayList<>(path));
                return;
            }
            for (int i = index; 9 - i + 1 >= k - path.size() && sum + i <= n; i++) {
                path.add(i);
                backtracking(k, n, i + 1, sum + i, path);
                path.remove(path.size() - 1);
            }
        }

        public List<List<Integer>> combinationSum3(int k, int n) {
            backtracking(k, n, 1, 0, new ArrayList<>());
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum3(3, 9));
    }
}
