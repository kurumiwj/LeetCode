package com.kurumi.leetCode.codeThoughts.二叉树._02_二叉树属性;

import java.util.LinkedList;
import java.util.Queue;

import com.kurumi.leetCode.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 513. 找树左下角的值
 */
public class LeetCode_0513 {
    static class Solution {
        int maxDepth = -1;
        int res;

        public void traversal(TreeNode root, int depth) {
            if (root.left == null && root.right == null) {
                if (depth > maxDepth) {
                    maxDepth = depth;
                    res = root.val;
                }
                return;
            }
            if (root.left != null)
                traversal(root.left, depth + 1);
            if (root.right != null)
                traversal(root.right, depth + 1);
            return;
        }

        public int findBottomLeftValue(TreeNode root) {
            traversal(root, 0);
            return res;
        }
    }

    static class Solution1 {
        public int findBottomLeftValue(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            if (root != null)
                q.offer(root);
            int res = 0;
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = q.poll();
                    if (i == 0)
                        res = node.val;
                    if (node.left != null)
                        q.offer(node.left);
                    if (node.right != null)
                        q.offer(node.right);
                }
            }
            return res;
        }
    }
}
