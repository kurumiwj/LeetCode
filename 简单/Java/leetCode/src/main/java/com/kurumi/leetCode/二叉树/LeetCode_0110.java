package com.kurumi.leetCode.二叉树;

import com.kurumi.leetCode.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-02 下午11:17:50
 * @Description 110. 平衡二叉树
 */
public class LeetCode_0110 {
    static class Solution {
        private int getHeight(TreeNode root) {
            if (root == null) return 0;
            int leftHeight = getHeight(root.left);
            if (leftHeight == -1) return -1;
            int rightHeight = getHeight(root.right);
            if (rightHeight == -1) return -1;
            if (Math.abs(leftHeight - rightHeight) > 1) return -1;
            return Math.max(leftHeight, rightHeight) + 1;
        }

        public boolean isBalanced(TreeNode root) {
            return getHeight(root) != -1;
        }
    }
}
