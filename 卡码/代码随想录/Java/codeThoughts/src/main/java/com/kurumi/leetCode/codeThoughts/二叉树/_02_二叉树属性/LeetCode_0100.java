package com.kurumi.leetCode.codeThoughts.二叉树._02_二叉树属性;

import com.kurumi.leetCode.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 100. 相同的树
 */
public class LeetCode_0100 {
    static class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q != null)
                return false;
            else if (p != null && q == null)
                return false;
            else if (p == null && q == null)
                return true;
            else if (p.val != q.val)
                return false;
            else
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
