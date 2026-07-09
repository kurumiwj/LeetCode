package com.kurumi.leetCode.codeThoughts.二叉树._06_二叉搜索树修改与改造;

import com.kurumi.leetCode.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 108. 将有序数组转换为二叉搜索树
 */
public class LeetCode_0108 {
    static class Solution {
        public TreeNode traversal(int[] nums, int left, int right) {
            if (left > right)
                return null;
            int mid = (left + right) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = traversal(nums, left, mid - 1);
            root.right = traversal(nums, mid + 1, right);
            return root;
        }

        public TreeNode sortedArrayToBST(int[] nums) {
            return traversal(nums, 0, nums.length - 1);
        }
    }
}
