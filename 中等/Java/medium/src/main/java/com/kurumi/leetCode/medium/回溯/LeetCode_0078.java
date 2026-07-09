package com.kurumi.leetCode.medium.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-05 下午1:26:51
 * @Description 78. 子集
 */
public class LeetCode_0078 {
    static class Solution {
        private List<List<Integer>> res = new ArrayList<>();

        private void backtracking(int[] nums, int index, List<Integer> list) {
            if (index == nums.length) {
                res.add(new ArrayList<>(list));
                return;
            }
            backtracking(nums, index + 1, list);
            list.add(nums[index]);
            backtracking(nums, index + 1, list);
            list.remove(list.size() - 1);
        }

        public List<List<Integer>> subsets(int[] nums) {
            if (nums.length == 0) return res;
            backtracking(nums, 0, new ArrayList<>());
            return res;
        }
    }

    static class Solution1 {
        private List<List<Integer>> res = new ArrayList<>();

        private void backtracking(int[] nums, int index, List<Integer> list) {
            res.add(new ArrayList<>(list));
            if (index == nums.length) return;
            for (int i = index; i < nums.length; i++) {
                list.add(nums[i]);
                backtracking(nums, i + 1, list);
                list.remove(list.size() - 1);
            }
        }

        public List<List<Integer>> subsets(int[] nums) {
            if (nums.length == 0) return res;
            backtracking(nums, 0, new ArrayList<>());
            return res;
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.subsets(new int[] {1, 2, 3}));
    }
}
