package com.kurumi.leetCode.codeThoughts.二叉树._01_二叉树遍历方式;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.kurumi.leetCode.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 637. 二叉树的层平均值
 */
public class LeetCode_0637 {
    static class Solution {
        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> res = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();
            if (root != null)
                q.offer(root);
            int size = 0;
            double sum = 0;
            while (!q.isEmpty()) {
                size = q.size();
                sum = 0;
                for (int i = 0; i < size; i++) {
                    TreeNode node = q.poll();
                    sum += node.val;
                    if (node.left != null)
                        q.offer(node.left);
                    if (node.right != null)
                        q.offer(node.right);
                }
                res.add(sum / size);
            }
            return res;
        }
    }
}
