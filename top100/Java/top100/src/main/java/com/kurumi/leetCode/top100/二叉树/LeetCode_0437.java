package com.kurumi.leetCode.top100.二叉树;

import java.util.HashMap;
import java.util.Map;

import com.kurumi.leetCode.top100.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-02 下午9:31:46
 * @Description 437. 路径总和 III
 */
public class LeetCode_0437 {
    static class Solution {
        private int res = 0;

        private void dfs(TreeNode root, long sum, int targetSum, Map<Long, Integer> map) {
            if (root == null) return;
            sum += root.val;
            res += map.getOrDefault(sum - targetSum, 0);
            map.merge(sum, 1, Integer::sum);
            dfs(root.left, sum, targetSum, map);
            dfs(root.right, sum, targetSum, map);
            map.merge(sum, -1, Integer::sum);
        }

        public int pathSum(TreeNode root, int targetSum) {
            Map<Long, Integer> map = new HashMap<Long, Integer>();
            map.put(0L, 1);
            dfs(root, 0, targetSum, map);
            return res;
        }
    }
}
