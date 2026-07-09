package com.kurumi.leetCode.top100.二叉树;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import com.kurumi.leetCode.top100.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-02 下午2:46:02
 * @Description 199. 二叉树的右视图
 */
public class LeetCode_0199 {
    static class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            if (root == null) return List.of();
            List<Integer> res = new ArrayList<Integer>();
            Deque<TreeNode> queue = new LinkedList<TreeNode>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                List<Integer> tmp = new ArrayList<Integer>();
                int n = queue.size();
                while (n-- > 0) {
                    TreeNode node = queue.poll();
                    tmp.add(node.val);
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
                res.add(tmp.get(tmp.size() - 1));
            }
            return res;
        }

        private void dfs(TreeNode root, int depth, List<Integer> res) {
            if (root == null) return;
            if (depth == res.size()) res.add(root.val);
            dfs(root.right, depth + 1, res);
            dfs(root.left, depth + 1, res);
        }

        public List<Integer> rightSideView1(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            dfs(root, 0, res);
            return res;
        }
    }
}
