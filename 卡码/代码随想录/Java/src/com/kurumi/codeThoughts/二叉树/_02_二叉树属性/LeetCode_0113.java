package com.kurumi.codeThoughts.二叉树._02_二叉树属性;

import java.util.LinkedList;
import java.util.List;

import com.kurumi.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 113. 路径总和 II
 */
public class LeetCode_0113 {
    static class Solution {
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> path = new LinkedList<>();

        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            traversal(root, targetSum);
            return res;
        }

        public void traversal(TreeNode root, int sum) {
            if (root == null)
                return;
            path.offer(root.val);
            sum -= root.val;
            // 叶子节点且sum减到0说明找到路径
            if (root.left == null && root.right == null && sum == 0)
                res.add(new LinkedList<>(path));
            traversal(root.left, sum);
            traversal(root.right, sum);
            path.removeLast();
        }
    }
}
