package com.kurumi.leetCode.codeThoughts.二叉树._02_二叉树属性;

import com.kurumi.leetCode.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 101. 对称二叉树
 */
public class LeetCode_0101 {
    static class Solution {
        public boolean compare(TreeNode left, TreeNode right) {
            if (left == null && right != null)
                return false;
            else if (left != null && right == null)
                return false;
            else if (left == null && right == null)
                return true;
            else if (left.val != right.val)
                return false;
            else
                return compare(left.left, right.right) && compare(left.right, right.left);
        }

        public boolean isSymmetric(TreeNode root) {
            if (root == null)
                return true;
            else
                return compare(root.left, root.right);
        }
    }
}
