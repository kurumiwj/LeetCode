package com.kurumi.leetCode.codeThoughts.贪心._03_困难;

import com.kurumi.leetCode.codeThoughts.entity.TreeNode;

public class LeetCode_0968 {
    static class Solution {
        int result = 0;

        public int traversal(TreeNode root) {
            if (root == null)
                return 2;
            int left = traversal(root.left);
            int right = traversal(root.right);
            if (left == 2 && right == 2)
                return 0;
            else if (left == 0 || right == 0) {
                result++;
                return 1;
            } else if (left == 1 || right == 1)
                return 2;
            return -1;
        }

        public int minCameraCover(TreeNode root) {
            if (traversal(root) == 0)
                result++;
            return result;
        }
    }
}
/*
 * 0:无覆盖 1:有摄像头 2:有覆盖
 */
