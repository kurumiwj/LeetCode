package com.kurumi.leetCode.scientificPractice.基础入门;

import com.kurumi.leetCode.scientificPractice.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-09 下午11:12:52
 * @Description 2236. 判断根结点是否等于子结点之和
 */
public class LeetCode_2236 {
    static class Solution {
        public boolean checkTree(TreeNode root) {
            return root.val == root.left.val +root.right.val;
        }
    }
}
