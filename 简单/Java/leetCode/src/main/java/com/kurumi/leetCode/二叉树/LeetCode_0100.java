package com.kurumi.leetCode.二叉树;

import com.kurumi.leetCode.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-02 下午11:10:12
 * @Description 100. 相同的树
 */
public class LeetCode_0100 {
    static class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) return true;
            if (p == null || q == null) return false;
            return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
