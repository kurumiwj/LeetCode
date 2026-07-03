package com.kurumi.codeThoughts.二叉树._03_二叉树修改与构造;

import com.kurumi.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 654. 最大二叉树
 */
public class LeetCode_0654 {
    static class Solution {
        public TreeNode traversal(int[] nums, int left, int right) {
            if (left >= right)
                return null;
            int maxIndex = left;
            for (int i = left; i < right; i++)
                if (nums[i] > nums[maxIndex])
                    maxIndex = i;
            TreeNode root = new TreeNode(nums[maxIndex]);
            root.left = traversal(nums, left, maxIndex);
            root.right = traversal(nums, maxIndex + 1, right);
            return root;
        }

        public TreeNode constructMaximumBinaryTree(int[] nums) {
            return traversal(nums, 0, nums.length);
        }
    }
}
