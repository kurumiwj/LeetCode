package com.kurumi.leetCode.basicPractice.二叉树;

import com.kurumi.leetCode.basicPractice.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-02 下午11:15:04
 * @Description 101. 对称二叉树
 */
public class LeetCode_0101 {
    static class Solution {
        private boolean isSymmetric(TreeNode left, TreeNode right) {
            if (left == null || right == null)
                return left == right;
            return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
        }

        public boolean isSymmetric(TreeNode root) {
            if (root == null)
                return true;
            return isSymmetric(root.left, root.right);
        }
    }
}
