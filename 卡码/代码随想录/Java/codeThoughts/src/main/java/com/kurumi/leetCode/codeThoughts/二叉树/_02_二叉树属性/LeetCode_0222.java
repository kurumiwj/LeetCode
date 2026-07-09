package com.kurumi.leetCode.codeThoughts.二叉树._02_二叉树属性;

import com.kurumi.leetCode.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 222. 完全二叉树的节点个数
 */
public class LeetCode_0222 {
    static class Solution {
        public int countNodes(TreeNode root) {
            if (root == null)
                return 0;
            TreeNode left = root.left;
            TreeNode right = root.right;
            int leftDepth = 0, rightDepth = 0;
            while (left != null) {
                left = left.left;
                leftDepth++;
            }
            while (right != null) {
                right = right.right;
                rightDepth++;
            }
            if (leftDepth == rightDepth)
                return (2 << leftDepth) - 1;
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }
}
