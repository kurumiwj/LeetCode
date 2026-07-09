package com.kurumi.leetCode.easy.二分查找;

import com.kurumi.leetCode.easy.entity.TreeNode;

/**
 * @Author Administrator
 * @Date 2026年6月13日 19:14:22
 * @Description 222. 完全二叉树的节点个数
 */
public class LeetCode_0222 {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
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
        if (leftDepth == rightDepth) {
            return (2 << leftDepth) - 1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
