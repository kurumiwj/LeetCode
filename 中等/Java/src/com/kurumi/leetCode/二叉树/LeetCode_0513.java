package com.kurumi.leetCode.二叉树;

import java.util.LinkedList;
import java.util.Queue;

import com.kurumi.leetCode.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午12:12:07
 * @Description 513. 找树左下角的值
 */
public class LeetCode_0513 {
    static class Solution {
        public int findBottomLeftValue(TreeNode root) {
            if (root == null) return -1;
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            queue.offer(root);
            TreeNode node = root;
            while (!queue.isEmpty()) {
                node = queue.poll();
                if (node.right != null) queue.offer(node.right);
                if (node.left != null) queue.offer(node.left);
            }
            return node.val;
        }
    }
}
