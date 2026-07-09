package com.kurumi.leetCode.codeThoughts.图论.bfs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 841. 钥匙和房间
 */
public class LeetCode_0841 {
    static class Solution {
        boolean bfs(List<List<Integer>> rooms) {
            boolean[] visited = new boolean[rooms.size()];
            Deque<Integer> q = new ArrayDeque<>();
            visited[0] = true;
            q.offer(0);
            while (!q.isEmpty()) {
                int key = q.poll();
                List<Integer> keys = rooms.get(key);
                for (int k : keys) {
                    if (!visited[k]) {
                        visited[k] = true;
                        q.offer(k);
                    }
                }
            }
            for (boolean visit : visited) {
                if (!visit)
                    return false;
            }
            return true;
        }

        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            return bfs(rooms);
        }
    }
}
