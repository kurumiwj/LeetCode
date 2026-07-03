package com.kurumi.codeThoughts.二叉树._02_二叉树属性;

import com.kurumi.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description LeetCode_0111
 */
public class LeetCode_0111 {
    static class Solution {
        public int minDepth(TreeNode root) {
            if (root == null)
                return 0;
            if (root.left != null && root.right == null)
                return 1 + minDepth(root.left);
            if (root.left == null && root.right != null)
                return 1 + minDepth(root.right);
            return 1 + Integer.min(minDepth(root.left), minDepth(root.right));
        }
    }
}
