package com.kurumi.leetCode.codeThoughts.二叉树._01_二叉树遍历方式;

import java.util.LinkedList;
import java.util.Queue;

import com.kurumi.leetCode.codeThoughts.entity.Node;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 116. 填充每个节点的下一个右侧节点指针
 */
public class LeetCode_0116 {
    static class Solution {
        public Node connect(Node root) {
            Queue<Node> q = new LinkedList<>();
            Node pre = null, cur = null;
            if (root != null)
                q.offer(root);
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    cur = q.poll();
                    if (i != 0)
                        pre.next = cur;
                    pre = cur;
                    if (cur.left != null)
                        q.offer(cur.left);
                    if (cur.right != null)
                        q.offer(cur.right);
                }
                cur.next = null;
            }
            return root;
        }
    }
}
