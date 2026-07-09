package com.kurumi.leetCode.codeThoughts.二叉树._02_二叉树属性;

import java.util.ArrayList;
import java.util.List;

import com.kurumi.leetCode.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 257. 二叉树的所有路径
 */
public class LeetCode_0257 {
    static class Solution {
        public void traversal(TreeNode root, String path, List<String> res) {
            path += root.val;
            // 到达叶子节点
            if (root.left == null && root.right == null) {
                res.add(path.toString());
                return;
            }
            if (root.left != null)
                traversal(root.left, path + "->", res);
            if (root.right != null)
                traversal(root.right, path + "->", res);
        }

        public List<String> binaryTreePaths(TreeNode root) {
            List<String> res = new ArrayList<>();
            String path = "";
            if (root == null)
                return res;
            traversal(root, path, res);
            return res;
        }
    }
}
