package com.kurumi.leetCode.codeThoughts.二叉树._03_二叉树修改与构造;

import com.kurumi.leetCode.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 106. 从中序与后序遍历序列构造二叉树
 */
public class LeetCode_0106 {
    static class Solution {
        public TreeNode traversal(int[] inOrder, int inLeft, int inRight, int[] postOrder, int postLeft, int postRight) {
            if (inRight < inLeft)
                return null;
            TreeNode root = new TreeNode(postOrder[postRight]);
            if (inRight == inLeft)
                return root;
            int rootIndex = 0;
            for (int i = inLeft; i <= inRight; i++) {
                if (inOrder[i] == root.val) {
                    rootIndex = i;
                    break;
                }
            }
            int leftLength = rootIndex - inLeft;
            root.left = traversal(inOrder, inLeft, rootIndex - 1, postOrder, postLeft, postLeft + leftLength - 1);
            root.right = traversal(inOrder, rootIndex + 1, inRight, postOrder, postLeft + leftLength, postRight - 1);
            return root;
        }

        public TreeNode buildTree(int[] inorder, int[] postorder) {
            if (inorder.length == 0 || postorder.length == 0)
                return null;
            return traversal(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
        }
    }
}
