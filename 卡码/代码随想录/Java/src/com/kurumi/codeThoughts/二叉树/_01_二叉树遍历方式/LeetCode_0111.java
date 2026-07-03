package com.kurumi.codeThoughts.二叉树._01_二叉树遍历方式;

import java.util.LinkedList;
import java.util.Queue;

import com.kurumi.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 111. 二叉树的最小深度
 */
public class LeetCode_0111 {
    static class Solution {
        public int minDepth(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            int depth = 0;
            if (root != null) {
                q.offer(root);
            }
            while (!q.isEmpty()) {
                int size = q.size();
                depth++;
                while (size-- > 0) {
                    TreeNode node = q.poll();
                    if (node.left != null) {
                        q.offer(node.left);
                    }
                    if (node.right != null) {
                        q.offer(node.right);
                    }
                    // 叶子节点
                    if (node.left == null && node.right == null)
                        return depth;
                }
            }
            return depth;
        }
    }
}
