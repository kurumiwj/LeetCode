package com.kurumi.leetCode.basicPractice.二叉树;

import com.kurumi.leetCode.basicPractice.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-01 下午2:11:25
 * @Description 104. 二叉树的最大深度
 */
public class LeetCode_0104 {
    static class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) return 0;
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }
}
