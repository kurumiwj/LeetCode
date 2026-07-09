package com.kurumi.leetCode.codeThoughts.二叉树._02_二叉树属性;

import com.kurumi.leetCode.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 404. 左叶子之和
 */
public class LeetCode_0404 {
    static class Solution {
        public int sumOfLeftLeaves(TreeNode root) {
            if (root == null)
                return 0;
            int leftSum = 0;
            if (root.left != null && root.left.left == null && root.left.right == null)
                leftSum = root.left.val;
            return leftSum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
    }
}
