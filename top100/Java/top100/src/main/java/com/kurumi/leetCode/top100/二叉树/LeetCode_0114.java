package com.kurumi.leetCode.top100.二叉树;

import com.kurumi.leetCode.top100.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-02 下午5:58:36
 * @Description 114. 二叉树展开为链表
 */
public class LeetCode_0114 {
    static class Solution {
        private TreeNode dfs(TreeNode root) {
            if (root == null) return null;
            TreeNode leftTail = dfs(root.left);
            TreeNode rightTail = dfs(root.right);
            if (leftTail != null) {
                leftTail.right = root.right;
                root.right = root.left;
                root.left = null;
            }
            return rightTail != null ? rightTail : leftTail != null ? leftTail : root;
        }

        public void flatten(TreeNode root) {
            dfs(root);
        }
    }

    static class Solution1 {
        private TreeNode head;

        public void flatten(TreeNode root) {
            if (root == null) return;
            flatten(root.right);
            flatten(root.left);
            root.left = null;
            root.right = head;
            head = root;
        }
    }
}
