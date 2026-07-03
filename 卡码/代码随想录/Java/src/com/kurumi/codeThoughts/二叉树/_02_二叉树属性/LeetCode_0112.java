package com.kurumi.codeThoughts.二叉树._02_二叉树属性;

import com.kurumi.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 112. 路径总和
 */
public class LeetCode_0112 {
    static class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null)
                return false;
            // 如果当前节点是叶子节点且目标和与叶子节点值相等则找到路径
            if (root.left == null && root.right == null && targetSum == root.val)
                return true;
            return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
        }
    }
}
