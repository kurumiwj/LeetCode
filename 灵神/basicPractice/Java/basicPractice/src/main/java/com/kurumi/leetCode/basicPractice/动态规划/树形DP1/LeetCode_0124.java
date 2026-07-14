package com.kurumi.leetCode.basicPractice.动态规划.树形DP1;

import java.util.Arrays;

import com.kurumi.leetCode.basicPractice.entity.TreeNode;
import com.kurumi.leetCode.basicPractice.utils.TreeNodeUtils;

/**
 * @Author kurumi
 * @Date 2026-07-08 上午10:31:24
 * @Description 124. 二叉树中的最大路径和
 */
public class LeetCode_0124 {
    static class Solution {
        private int maxSum = Integer.MIN_VALUE;

        private int dfs(TreeNode root) {
            if (root == null) return 0;
            int leftSum = dfs(root.left);
            int rightSum = dfs(root.right);
            int sum = root.val;
            if (leftSum > 0) sum += leftSum;
            if (rightSum > 0) sum += rightSum;
            maxSum = Math.max(maxSum, sum);
            int childSum = Math.max(leftSum, rightSum);
            return childSum > 0 ? childSum + root.val : root.val;
        }

        public int maxPathSum(TreeNode root) {
            dfs(root);
            return maxSum;
        }
    }

    static class Solution1 {
        private int maxSum = Integer.MIN_VALUE;

        private int dfs(TreeNode root) {
            if (root == null) return 0;
            int leftSum = dfs(root.left);
            int rightSum = dfs(root.right);
            maxSum = Math.max(maxSum, leftSum + rightSum + root.val);
            return Math.max(Math.max(leftSum, rightSum) + root.val, 0);
        }

        public int maxPathSum(TreeNode root) {
            dfs(root);
            return maxSum;
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
//        System.out.println(solution.maxPathSum(TreeNodeUtils.init(List.of(1,2,3))));
//        System.out.println(solution.maxPathSum(TreeNodeUtils.init(Arrays.asList(-10,9,20,null,null,15,7))));
//        System.out.println(solution.maxPathSum(TreeNodeUtils.init(Arrays.asList(-3))));
//        System.out.println(solution.maxPathSum(TreeNodeUtils.init(Arrays.asList(2,-1))));
        System.out.println(solution.maxPathSum(TreeNodeUtils.init(Arrays.asList(5,4,8,11,null,13,4,7,2,null,null,null,1))));
    }
}
