package com.kurumi.leetCode.top100.二叉树;

import com.kurumi.leetCode.top100.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-06-30 下午6:09:14
 * @Description 543. 二叉树的直径
 */
public class LeetCode_0543 {
    static class Solution {
        private int res = 0;

        private int getHeight(TreeNode node){
            if (node == null) return 0;
            int left = getHeight(node.left);
            int right = getHeight(node.right);
            res = Math.max(res, left + right);
            return 1 + Math.max(left, right);
        }

        public int diameterOfBinaryTree(TreeNode root) {
            getHeight(root);
            return res;
        }
    }
}
