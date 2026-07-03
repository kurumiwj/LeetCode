package com.kurumi.codeThoughts.二叉树._02_二叉树属性;

import com.kurumi.codeThoughts.entity.Node1;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 559. N 叉树的最大深度
 */
public class LeetCode_0559 {
    static class Solution {
        public int maxDepth(Node1 root) {
            if (root == null)
                return 0;
            int depth = 0;
            for (Node1 node : root.children) {
                depth = Integer.max(depth, maxDepth(node));
            }
            return 1 + depth;
        }
    }
}


