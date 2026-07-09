package com.kurumi.leetCode.top100.二叉树;

import java.util.ArrayList;
import java.util.List;

import com.kurumi.leetCode.top100.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-01 下午2:08:18
 * @Description 94. 二叉树的中序遍历
 */
public class LeetCode_0094 {
    static class Solution {
        private void inOrder(TreeNode root, List<Integer> res) {
            if (root == null) return;
            inOrder(root.left, res);
            res.add(root.val);
            inOrder(root.right, res);
        }

        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            inOrder(root, res);
            return res;
        }
    }
}
