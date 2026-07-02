package com.kurumi.leetCode.二叉树;

import java.util.ArrayList;
import java.util.List;

import com.kurumi.leetCode.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-02 下午2:46:02
 * @Description 199. 二叉树的右视图
 */
public class LeetCode_0199 {
    static class Solution {
        private void dfs(TreeNode root, int depth, List<Integer> res) {
            if (root == null) return;
            if (depth == res.size()) res.add(root.val);
            dfs(root.right, depth + 1, res);
            dfs(root.left, depth + 1, res);
        }

        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            dfs(root, 0, res);
            return res;
        }
    }
}
