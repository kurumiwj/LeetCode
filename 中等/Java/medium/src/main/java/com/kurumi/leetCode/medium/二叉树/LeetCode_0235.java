package com.kurumi.leetCode.medium.二叉树;

import com.kurumi.leetCode.medium.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-02 下午11:55:37
 * @Description 235. 二叉搜索树的最近公共祖先
 */
public class LeetCode_0235 {
    static class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null || root.val == p.val || root.val == q.val) return root;
            if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
            if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
            else return root;
        }
    }
}
