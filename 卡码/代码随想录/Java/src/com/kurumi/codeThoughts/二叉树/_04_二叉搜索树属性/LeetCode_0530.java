package com.kurumi.codeThoughts.二叉树._04_二叉搜索树属性;

import com.kurumi.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 530. 二叉搜索树的最小绝对差
 */
public class LeetCode_0530 {
    static class Solution {
        TreeNode pre = null;
        int res = Integer.MAX_VALUE;

        public void traversal(TreeNode root) {
            if (root == null)
                return;
            traversal(root.left);
            if (pre != null)
                res = Integer.min(res, root.val - pre.val);
            pre = root;
            traversal(root.right);
        }

        public int getMinimumDifference(TreeNode root) {
            traversal(root);
            return res;
        }
    }
}
