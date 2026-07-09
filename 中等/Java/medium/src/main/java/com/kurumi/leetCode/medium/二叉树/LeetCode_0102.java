package com.kurumi.leetCode.medium.二叉树;

import com.kurumi.leetCode.medium.entity.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author kurumi
 * @Date 2026-07-01 下午9:19:43
 * @Description 102. 二叉树的层序遍历
 */
public class LeetCode_0102 {
    static class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            Queue<TreeNode> list = new LinkedList<>();
            if (root == null) return res;
            list.offer(root);
            while (!list.isEmpty()) {
                int n = list.size();
                List<Integer> tmp = new ArrayList<>(n);
                while (n-- > 0) {
                    TreeNode cur = list.poll();
                    tmp.add(cur.val);
                    if (cur.left != null) list.offer(cur.left);
                    if (cur.right != null) list.offer(cur.right);
                }
                res.add(tmp);
            }
            return res;
        }
    }

    static class Solution1 {
        List<List<Integer>> res = new ArrayList<>();

        public List<List<Integer>> levelOrder1(TreeNode root) {
            levelOrder1(root, 0);
            return res;
        }

        private void levelOrder1(TreeNode root, int level) {
            if (root == null) return;
            if (res.size() < level + 1) {
                res.add(new ArrayList<>());
            }
            res.get(level).add(root.val);
            levelOrder1(root.left, level + 1);
            levelOrder1(root.right, level + 1);
        }
    }
}
