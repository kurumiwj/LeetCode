package com.kurumi.leetCode.codeThoughts.二叉树._01_二叉树遍历方式;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.kurumi.leetCode.codeThoughts.entity.Node1;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 429. N 叉树的层序遍历
 */
public class LeetCode_0429 {
    static class Solution {
        public List<List<Integer>> levelOrder(Node1 root) {
            List<List<Integer>> res = new ArrayList<>();
            Queue<Node1> q = new LinkedList<>();
            if (root != null)
                q.offer(root);
            while (!q.isEmpty()) {
                int size = q.size();
                List<Integer> v = new ArrayList<>();
                while (size-- > 0) {
                    Node1 node = q.poll();
                    v.add(node.val);
                    // node.children.stream().forEach(item->{q.offer(item);});
                    for (Node1 tmp : node.children) {
                        if (tmp != null)
                            q.offer(tmp);
                    }
                }
                res.add(v);
            }
            return res;
        }
    }
}
