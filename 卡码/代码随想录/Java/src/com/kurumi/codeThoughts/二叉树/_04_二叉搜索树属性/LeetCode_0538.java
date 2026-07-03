package com.kurumi.codeThoughts.二叉树._04_二叉搜索树属性;

import com.kurumi.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 538. 把二叉搜索树转换为累加树
 */
public class LeetCode_0538 {
    static class Solution {
        int pre = 0;

        public void traversal(TreeNode root) {
            if (root == null)
                return;
            traversal(root.right);
            root.val += pre;
            pre = root.val;
            traversal(root.left);
        }

        public TreeNode convertBST(TreeNode root) {
            pre = 0;
            traversal(root);
            return root;
        }
    }
}
