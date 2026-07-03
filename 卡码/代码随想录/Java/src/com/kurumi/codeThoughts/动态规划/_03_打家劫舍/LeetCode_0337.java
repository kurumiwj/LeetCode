package com.kurumi.codeThoughts.动态规划._03_打家劫舍;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 337. 打家劫舍 III
 */
public class LeetCode_0337 {
    static class Solution {
        public int[] traversal(TreeNode root) {
            if (root == null)
                return new int[] { 0, 0 };
            int[] left = traversal(root.left);
            int[] right = traversal(root.right);
            // 不偷
            int v0 = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
            // 偷
            int v1 = left[0] + right[0] + root.val;
            return new int[] { v0, v1 };
        }

        public int rob(TreeNode root) {
            int[] res = traversal(root);
            return Math.max(res[0], res[1]);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
