package com.kurumi.basicPractice.动态规划;

import java.util.List;

import com.kurumi.basicPractice.entity.TreeNode;
import com.kurumi.basicPractice.utils.TreeNodeUtils;

/**
 * @Author kurumi
 * @Date 2026-07-07 下午11:19:56
 * @Description 543. 二叉树的直径
 */
public class LeetCode_0543 {
    static class Solution {
        private int res = 0;

        private int depth(TreeNode root) {
            if (root == null) return 0;
            int leftDepth = depth(root.left);
            int rightDepth = depth(root.right);
            res = Math.max(res, leftDepth + rightDepth);
            return Math.max(leftDepth, rightDepth) + 1;
        }

        public int diameterOfBinaryTree(TreeNode root) {
            depth(root);
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.diameterOfBinaryTree(TreeNodeUtils.init(List.of(1,2,3,4,5))));
        System.out.println(solution.diameterOfBinaryTree(TreeNodeUtils.init(List.of(1,2))));
    }
}
