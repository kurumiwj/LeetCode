package com.kurumi.top100.二叉树;

import com.kurumi.top100.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-02 下午2:19:17
 * @Description 230. 二叉搜索树中第 K 小的元素
 */
public class LeetCode_0230 {
    static class Solution {
        private int getTotalNodes(TreeNode root) {
            if (root == null) return 0;
            if (root.left == null && root.right == null) return 1;
            return getTotalNodes(root.left) + getTotalNodes(root.right) + 1;
        }

        public int kthSmallest(TreeNode root, int k) {
            if (root == null) return 0;
            int leftNodes = getTotalNodes(root.left);
            if (leftNodes == k - 1) return root.val;
            if (leftNodes > k - 1) return kthSmallest(root.left, k);
            else return kthSmallest(root.right, k - leftNodes - 1);
        }

        private int res;
        private int k;

        public int kthSmallest1(TreeNode root, int k) {
            this.k = k;
            inOrder(root);
            return res;
        }

        private void inOrder(TreeNode root) {
            if (root == null || k <= 0) return;
            inOrder(root.left);
            if (--k == 0) res = root.val;
            inOrder(root.right);
        }
    }
}
