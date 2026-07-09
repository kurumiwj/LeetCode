package com.kurumi.leetCode.codeThoughts.二叉树._06_二叉搜索树修改与改造;

import com.kurumi.leetCode.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 701. 二叉搜索树中的插入操作
 */
public class LeetCode_0701 {
    static class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null)
                return new TreeNode(val);
            if (val < root.val)
                root.left = insertIntoBST(root.left, val);
            else if (val > root.val)
                root.right = insertIntoBST(root.right, val);
            return root;
        }
    }
}
