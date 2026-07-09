package com.kurumi.leetCode.codeThoughts.二叉树._03_二叉树修改与构造;

import com.kurumi.leetCode.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 226. 翻转二叉树
 */
public class LeetCode_0226 {
    static class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root == null)
                return root;
            swap(root);
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }

        public void swap(TreeNode root) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
        }
    }
}
