package com.kurumi.leetCode.top100.二叉树;

import com.kurumi.leetCode.top100.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-01 下午2:13:05
 * @Description 226. 翻转二叉树
 */
public class LeetCode_0226 {
    static class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root == null) return null;
            TreeNode left = invertTree(root.left);
            TreeNode right = invertTree(root.right);
            root.left = right;
            root.right = left;
            return root;
        }
    }
}
