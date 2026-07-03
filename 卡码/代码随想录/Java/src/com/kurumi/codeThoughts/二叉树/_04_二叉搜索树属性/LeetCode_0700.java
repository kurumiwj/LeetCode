package com.kurumi.codeThoughts.二叉树._04_二叉搜索树属性;

import com.kurumi.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 700. 二叉搜索树中的搜索
 */
public class LeetCode_0700 {
    static class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            while (root != null) {
                if (val < root.val)
                    root = root.left;
                else if (val > root.val)
                    root = root.right;
                else
                    return root;
            }
            return null;
        }
    }
}
