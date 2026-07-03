package com.kurumi.codeThoughts.图论.dfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 797. 所有可能的路径
 */
public class LeetCode_0797 {
    static class Solution {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque();

        public void dfs(int[][] graph, int index) {
            if (index == graph.length - 1) {
                res.add(new ArrayList<>(path));
                return;
            }
            for (int i = 0; i < graph[index].length; i++) {
                path.offer(graph[index][i]);
                dfs(graph, graph[index][i]);
                path.pollLast();
            }
        }

        public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
            path.add(0);
            dfs(graph, 0);
            return res;
        }
    }
}
