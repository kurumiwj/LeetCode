package com.kurumi.leetCode.codeThoughts.二叉树._02_二叉树属性;

import com.kurumi.leetCode.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 104. 二叉树的最大深度
 */
public class LeetCode_0104 {
    static class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null)
                return 0;
            return 1 + Integer.max(maxDepth(root.left), maxDepth(root.right));
        }
    }
}
