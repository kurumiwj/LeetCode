package com.kurumi.codeThoughts.二叉树._05_二叉树公共祖先;

import com.kurumi.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 235. 二叉搜索树的最近公共祖先
 */
public class LeetCode_0235 {
    static class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            while (root != null) {
                if (root.val > p.val && root.val > q.val)
                    root = root.left;
                else if (root.val < p.val && root.val < q.val)
                    root = root.right;
                else
                    return root;
            }
            return null;
        }
    }
}
