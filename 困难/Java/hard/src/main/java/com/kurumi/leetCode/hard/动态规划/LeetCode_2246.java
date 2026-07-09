package com.kurumi.leetCode.hard.动态规划;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-08 上午11:04:11
 * @Description 2246. 相邻字符不同的最长路径
 */
public class LeetCode_2246 {
    static class Solution {
        private int res;
        private String s;
        private List<Integer>[] g;

        private int dfs(int x) {
            int xLen = 0;
            for (int y : g[x]) {
                int yLen = dfs(y) + 1;
                if (s.charAt(y) != s.charAt(x)) {
                    res = Math.max(res, xLen + yLen);
                    xLen = Math.max(xLen, yLen);
                }
            }
            return xLen;
        }

        public int longestPath(int[] parent, String s) {
            int n = parent.length;
            this.s = s;
            g = new ArrayList[n];
            Arrays.setAll(g, l -> new ArrayList<>());
            for (int i = 1; i < n; i++) {
                g[parent[i]].add(i);
            }
            dfs(0);
            return res + 1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPath(new int[] {-1,0,0,1,1,2}, "abacbe"));
    }
}
