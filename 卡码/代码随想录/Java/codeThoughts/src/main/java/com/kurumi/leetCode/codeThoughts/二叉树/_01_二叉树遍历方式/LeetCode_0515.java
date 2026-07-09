package com.kurumi.leetCode.codeThoughts.二叉树._01_二叉树遍历方式;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.kurumi.leetCode.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 515. 在每个树行中找最大值
 */
public class LeetCode_0515 {
    static class Solution {
        public List<Integer> largestValues(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();
            if (root != null)
                q.offer(root);
            while (!q.isEmpty()) {
                int size = q.size();
                int max = q.peek().val;
                while (size-- > 0) {
                    TreeNode node = q.poll();
                    max = max > node.val ? max : node.val;
                    if (node.left != null)
                        q.offer(node.left);
                    if (node.right != null)
                        q.offer(node.right);
                }
                res.add(max);
            }
            return res;
        }
    }
}
