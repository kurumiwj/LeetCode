package com.kurumi.codeThoughts.二叉树._01_二叉树遍历方式;

import java.util.ArrayList;
import java.util.List;

import com.kurumi.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 144-145-94.二叉树的前/后/中序遍历
 */
public class LeetCode_0144_0145_0094 {
    static class Solution {
        // 先序遍历
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList();
            preOrder(root, res);
            return res;
        }

        void preOrder(TreeNode root, List<Integer> v) {
            if (root == null)
                return;
            v.add(root.val);
            preOrder(root.left, v);
            preOrder(root.right, v);
        }

        // 中序遍历
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList();
            inOrder(root, res);
            return res;
        }

        void inOrder(TreeNode root, List<Integer> v) {
            if (root == null) {
                return;
            }
            inOrder(root.left, v);
            v.add(root.val);
            inOrder(root.right, v);
        }

        // 后序遍历
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList();
            postOrder(root, res);
            return res;
        }

        void postOrder(TreeNode root, List<Integer> v) {
            if (root == null) {
                return;
            }
            postOrder(root.left, v);
            postOrder(root.right, v);
            v.add(root.val);
        }
    }
}
