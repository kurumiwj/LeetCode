package com.kurumi.leetCode.codeThoughts.二叉树._04_二叉搜索树属性;

import com.kurumi.leetCode.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 98. 验证二叉搜索树
 */
public class LeetCode_0098 {
    static class Solution {
        TreeNode pre = null;

        public boolean isValidBST(TreeNode root) {
            if (root == null)
                return true;
            boolean left = isValidBST(root.left);
            if (pre != null && pre.val >= root.val)
                return false;
            pre = root;
            boolean right = isValidBST(root.right);
            return left && right;
        }
    }
}
