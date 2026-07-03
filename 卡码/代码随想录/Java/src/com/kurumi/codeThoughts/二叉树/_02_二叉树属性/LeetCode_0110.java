package com.kurumi.codeThoughts.二叉树._02_二叉树属性;

import com.kurumi.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 110. 平衡二叉树
 */
public class LeetCode_0110 {
    static class Solution {
        public int getHeight(TreeNode root) {
            if (root == null)
                return 0;
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);
            if (leftHeight == -1 || rightHeight == -1)
                return -1;
            return Math.abs(leftHeight - rightHeight) > 1 ? -1 : 1 + Integer.max(leftHeight, rightHeight);
        }

        public boolean isBalanced(TreeNode root) {
            return getHeight(root) == -1 ? false : true;
        }
    }
}
