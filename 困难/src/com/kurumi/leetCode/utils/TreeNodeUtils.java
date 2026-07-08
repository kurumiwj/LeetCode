package com.kurumi.leetCode.utils;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.kurumi.leetCode.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-07 下午11:25:21
 * @Description TreeNodeUtils
 */
public class TreeNodeUtils {
    // 初始化二叉树
    public static TreeNode init(List<Integer> nums) {
        if (nums == null || nums.isEmpty() || nums.get(0) == null) {
            return null;
        }

        TreeNode root = new TreeNode(nums.get(0));
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int index = 1;
        while (!queue.isEmpty() && index < nums.size()) {
            TreeNode node = queue.poll();

            Integer leftVal = nums.get(index++);
            if (leftVal != null) {
                node.left = new TreeNode(leftVal);
                queue.offer(node.left);
            }

            if (index >= nums.size()) {
                break;
            }

            Integer rightVal = nums.get(index++);
            if (rightVal != null) {
                node.right = new TreeNode(rightVal);
                queue.offer(node.right);
            }
        }
        return root;
    }

    // 输出二叉树(不含null)
    public static void print(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.printf("%d, ", node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        System.out.println();
    }

    // 输出二叉树(含null)
    public static void printWithNull(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.printf("%d, ", node != null ? node.val : node);
            if (node == null) continue;
            queue.offer(node.left);
            queue.offer(node.right);
        }
        System.out.println();
    }

    // 先序遍历
    public static void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    // 后序遍历
    public static void postOrder(TreeNode root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val);
    }

    // 中序遍历
    public static void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.val);
        inOrder(root.right);
    }

    // 层序遍历
    public static void levelOrder(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
    }
}
