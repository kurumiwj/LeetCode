package com.kurumi.top100.二叉树;

import com.kurumi.top100.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-01 下午10:59:43
 * @Description 98. 验证二叉搜索树
 */
public class LeetCode_0098 {
    static class Solution {
        private TreeNode getMin(TreeNode root) {
            while (root.left != null) root = root.left;
            return root;
        }

        private TreeNode getMax(TreeNode root) {
            while (root.right != null) root = root.right;
            return root;
        }

        public boolean isValidBST(TreeNode root) {
            if (root == null) return true;
            if (root.left != null && getMax(root.left).val >= root.val) return false;
            if (root.right != null && getMin(root.right).val <= root.val) return false;
            return isValidBST(root.left) && isValidBST(root.right);
        }
    }
}
