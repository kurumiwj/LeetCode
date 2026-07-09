package com.kurumi.leetCode.codeThoughts.二叉树._01_二叉树遍历方式;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.kurumi.leetCode.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 199. 二叉树的右视
 */
public class LeetCode_0199 {
    static class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();
            if (root != null)
                q.offer(root);
            int size;
            while (!q.isEmpty()) {
                size = q.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = q.poll();
                    if (i == size - 1)
                        res.add(node.val);
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
