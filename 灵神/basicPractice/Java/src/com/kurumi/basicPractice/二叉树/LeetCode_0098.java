package com.kurumi.basicPractice.二叉树;

import com.kurumi.basicPractice.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-01 下午10:59:43
 * @Description 98. 验证二叉搜索树
 */
public class LeetCode_0098 {
    static class Solution {
        private boolean isValidBST(TreeNode root, long min, long max) {
            if (root == null) return true;
            return root.val > min && root.val < max && isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
        }

        public boolean isValidBST(TreeNode root) {
            return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }
    }
}
