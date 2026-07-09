package com.kurumi.leetCode.codeThoughts.二叉树._06_二叉搜索树修改与改造;

import com.kurumi.leetCode.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 669. 修剪二叉搜索树
 */
public class LeetCode_0669 {
    static class Solution {
        public TreeNode trimBST(TreeNode root, int low, int high) {
            if (root == null)
                return null;
            if (root.val < low)
                return trimBST(root.right, low, high);
            else if (root.val > high)
                return trimBST(root.left, low, high);
            else {
                root.left = trimBST(root.left, low, high);
                root.right = trimBST(root.right, low, high);
            }
            return root;
        }
    }
}
