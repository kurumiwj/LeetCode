package com.kurumi.leetCode.codeThoughts.二叉树._03_二叉树修改与构造;

import com.kurumi.leetCode.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 617. 合并二叉树
 */
public class LeetCode_0617 {
    static class Solution {
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            if (root1 == null)
                return root2;
            if (root2 == null)
                return root1;
            root1.val += root2.val;
            root1.left = mergeTrees(root1.left, root2.left);
            root1.right = mergeTrees(root1.right, root2.right);
            return root1;
        }
    }
}
