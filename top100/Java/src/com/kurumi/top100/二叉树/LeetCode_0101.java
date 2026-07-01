package com.kurumi.top100.二叉树;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.kurumi.top100.entity.TreeNode;
import com.kurumi.top100.utils.TreeNodeUtils;

/**
 * @Author kurumi
 * @Date 2026-07-01 下午2:18:17
 * @Description 101. 对称二叉树
 */
public class LeetCode_0101 {
    static class Solution {
        private boolean isSymmetric(TreeNode left, TreeNode right) {
            if (left == null || right == null) return left == right;
            return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
        }

        // 递归
        public boolean isSymmetric(TreeNode root) {
            if (root == null) return true;
            return isSymmetric(root.left, root.right);
        }

        // 迭代
        public boolean isSymmetric1(TreeNode root) {
            if (root == null) return true;
            if (root.left == null || root.right == null) return root.left == root.right;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root.left);
            queue.offer(root.right);
            while (!queue.isEmpty()) {
                TreeNode left = queue.poll();
                TreeNode right = queue.poll();
                if (left == null && right == null) continue;
                if ((left == null || right == null) || (left.val != right.val)) return false;
                queue.add(left.left);
                queue.add(right.right);
                queue.add(left.right);
                queue.add(right.left);
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeNodeUtils.init(List.of(1,2,2,3,4,4,3));
        TreeNodeUtils.print(root);
        System.out.println(solution.isSymmetric1(root));

        root = TreeNodeUtils.init(Arrays.asList(1,2,2,null,3,null,3));
        TreeNodeUtils.print(root);
        System.out.println(solution.isSymmetric1(root));
    }
}
