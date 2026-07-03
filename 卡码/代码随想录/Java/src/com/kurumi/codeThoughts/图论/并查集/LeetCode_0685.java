package com.kurumi.codeThoughts.图论.并查集;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 685. 冗余连接 II
 */
public class LeetCode_0685 {
    static class Solution {
        int n;
        int[] father;

        private void init(int n) {
            for (int i = 0; i < n + 1; i++)
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

        private int[] removeEdge(int[][] edges) {
            init(n);
            int[] res = new int[] {};
            for (int i = 0; i < n; i++) {
                if (isSame(edges[i][0], edges[i][1]))
                    res = edges[i];
                else
                    join(edges[i][0], edges[i][1]);
            }
            return res;
        }

        private boolean isTreeAfterRemoveEdge(int[][] edges, int delete) {
            init(n);
            for (int i = 0; i < n; i++) {
                if (i == delete)
                    continue;
                if (isSame(edges[i][0], edges[i][1]))
                    return false;
                join(edges[i][0], edges[i][1]);
            }
            return true;
        }

        public int[] findRedundantDirectedConnection(int[][] edges) {
            n = edges.length;
            father = new int[n + 1];
            int[] inDegrees = new int[n + 1];
            for (int i = 0; i < n; i++)
                inDegrees[edges[i][1]]++;
            int[] v2 = new int[2];
            int index = 0;
            for (int i = n - 1; i >= 0; i--)
                if (inDegrees[edges[i][1]] == 2)
                    v2[index++] = i;
            if (index > 1) {
                if (isTreeAfterRemoveEdge(edges, v2[0]))
                    return edges[v2[0]];
                else
                    return edges[v2[1]];
            }
            return removeEdge(edges);
        }
    }
}
