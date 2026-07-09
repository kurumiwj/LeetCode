package com.kurumi.leetCode.codeThoughts.图论.dfs;

import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 841. 钥匙和房间
 */
public class LeetCode_0841 {
    static class Solution {
        boolean[] visited;

        void dfs(List<List<Integer>> rooms, int key) {
            if (visited[key])
                return;
            visited[key] = true;
            List<Integer> keys = rooms.get(key);
            for (int k : keys) {
                if (!visited[k])
                    dfs(rooms, k);
            }
        }

        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            visited = new boolean[rooms.size()];
            dfs(rooms, 0);
            for (boolean visit : visited) {
                if (!visit)
                    return false;
            }
            return true;
        }
    }
}
