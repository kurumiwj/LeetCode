package com.kurumi.codeThoughts.二叉树._06_二叉搜索树修改与改造;

import com.kurumi.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 450. 删除二叉搜索树中的节点
 */
public class LeetCode_0450 {
    static class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {
            if (root == null)
                return null;
            if (key < root.val)
                root.left = deleteNode(root.left, key);
            else if (key > root.val)
                root.right = deleteNode(root.right, key);
            else {
                if (root.left == null && root.right == null)
                    return null;
                else if (root.left != null && root.right == null)
                    return root.left;
                else if (root.right != null && root.left == null)
                    return root.right;
                else {
                    TreeNode tmp = root.right;
                    TreeNode parent = root;
                    // 找出右子树中最小值
                    while (tmp.left != null) {
                        parent = tmp;
                        tmp = tmp.left;
                    }
                    // 将最小值与root值交换
                    root.val = tmp.val;
                    // 删除最小节点
                    if (parent == root)
                        parent.right = tmp.right;
                    else
                        parent.left = tmp.right;
                }
            }
            return root;
        }
    }
}
