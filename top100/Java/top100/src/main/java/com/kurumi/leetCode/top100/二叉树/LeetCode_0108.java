package com.kurumi.leetCode.top100.二叉树;

import com.kurumi.leetCode.top100.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-01 下午10:40:41
 * @Description 108. 将有序数组转换为二叉搜索树
 */
public class LeetCode_0108 {
    static class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            if (nums == null) return null;
            return sortedArrayToBST(nums, 0, nums.length - 1);
        }

        private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
            if (start > end) return null;
            if (start == end) return new TreeNode(nums[start]);
            int mid = (start + end) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = sortedArrayToBST(nums, start, mid - 1);
            root.right = sortedArrayToBST(nums, mid + 1, end);
            return root;
        }
    }
}
