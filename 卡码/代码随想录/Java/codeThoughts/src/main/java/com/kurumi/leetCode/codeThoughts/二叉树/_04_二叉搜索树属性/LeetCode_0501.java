package com.kurumi.leetCode.codeThoughts.二叉树._04_二叉搜索树属性;

import java.util.ArrayList;
import java.util.List;

import com.kurumi.leetCode.codeThoughts.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 501. 二叉搜索树中的众数
 */
public class LeetCode_0501 {
    static class Solution {
        List<Integer> res = new ArrayList<>();
        TreeNode pre = null;
        int maxCount = 0;
        int count = 0;

        public void traversal(TreeNode root) {
            if (root == null)
                return;
            traversal(root.left);
            if (pre == null)
                count = 1;
            else if (root.val == pre.val)
                count++;
            else
                count = 1;
            pre = root;
            if (count == maxCount)
                res.add(root.val);
            if (count > maxCount) {
                maxCount = count;
                res.clear();
                res.add(root.val);
            }
            traversal(root.right);
            return;
        }

        public int[] findMode(TreeNode root) {
            traversal(root);
            int[] result = new int[res.size()];
            for (int i = 0; i < result.length; i++) {
                result[i] = res.get(i);
            }
            return result;
        }
    }
}
