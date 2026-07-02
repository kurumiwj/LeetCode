package com.kurumi.leetCode.二叉树;

import com.kurumi.leetCode.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-02 下午10:18:02
 * @Description 236. 二叉树的最近公共祖先
 */
public class LeetCode_0236 {
    static class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null || p == root || q == root) return root;
            TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
            TreeNode rightNode = lowestCommonAncestor(root.right, p, q);
            if (leftNode == null && rightNode == null) return null;
            else if (leftNode == null) return rightNode;
            else if (rightNode == null) return leftNode;
            else return root;
        }
    }
}
