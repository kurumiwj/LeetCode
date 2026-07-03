package com.kurumi.codeThoughts.二叉树._02_二叉树属性;

import com.kurumi.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 572. 另一棵树的子树
 */
public class LeetCode_0572 {
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
                return compare(left.left, right.left) && compare(left.right, right.right);
        }

        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if (root == null)
                return false;
            return compare(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }
}
