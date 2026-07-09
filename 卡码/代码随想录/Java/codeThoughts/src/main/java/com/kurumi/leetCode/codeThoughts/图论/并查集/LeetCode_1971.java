package com.kurumi.leetCode.codeThoughts.图论.并查集;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 1971. 寻找图中是否存在路径
 */
public class LeetCode_1971 {
    static class Solution {
        final int n = 200005;
        int[] father = new int[n];

        private void init(int n) {
            for (int i = 0; i < n; i++) {
                father[i] = i;
            }
        }

        private int find(int u) {
            if (u == father[u])
                return u;
            else
                return father[u] = find(father[u]);
        }

        private boolean isSame(int u, int v) {
            u = find(u);
            v = find(v);
            return u == v;
        }

        private void join(int u, int v) {
            u = find(u);
            v = find(v);
            if (u == v)
                return;
            father[u] = v;
        }

        public boolean validPath(int n, int[][] edges, int source, int destination) {
            init(n);
            for (int i = 0; i < edges.length; i++) {
                join(edges[i][0], edges[i][1]);
            }
            return isSame(source, destination);
        }
    }
}
