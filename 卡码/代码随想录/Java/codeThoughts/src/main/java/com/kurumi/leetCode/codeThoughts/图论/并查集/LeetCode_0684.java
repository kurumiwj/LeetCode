package com.kurumi.leetCode.codeThoughts.图论.并查集;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 684. 冗余连接
 */
public class LeetCode_0684 {
    static class Solution {
        int[] father;

        private void init(int n) {
            for (int i = 0; i <= n; i++)
                father[i] = i;
        }

        private int find(int u) {
            if (u == father[u])
                return u;
            father[u] = find(father[u]);
            return father[u];
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
            father[v] = u;
        }

        public int[] findRedundantConnection(int[][] edges) {
            int n = edges.length;
            father = new int[n + 1];
            init(n);
            int[] res = new int[] {};
            for (int[] edge : edges) {
                if (isSame(edge[0], edge[1]))
                    res = edge;
                else
                    join(edge[0], edge[1]);
            }
            return res;
        }
    }
}
