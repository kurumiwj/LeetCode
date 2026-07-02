package com.kurumi.leetCode.二叉树;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.kurumi.leetCode.entity.TreeNode;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午12:01:43
 * @Description 103. 二叉树的锯齿形层序遍历
 */
public class LeetCode_0103 {
    static class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            Queue<TreeNode> list = new LinkedList<>();
            if (root == null) return res;
            list.offer(root);
            boolean odd = true;
            while (!list.isEmpty()) {
                int n = list.size();
                List<Integer> tmp = new ArrayList<>(n);
                while (n-- > 0) {
                    TreeNode cur = list.poll();
                    tmp.add(cur.val);
                    if (cur.left != null) list.offer(cur.left);
                    if (cur.right != null) list.offer(cur.right);
                }
                if (!odd) Collections.reverse(tmp);
                res.add(tmp);
                odd = !odd;
            }
            return res;
        }
    }
}
