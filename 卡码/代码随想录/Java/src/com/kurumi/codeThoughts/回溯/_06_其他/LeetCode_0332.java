package com.kurumi.codeThoughts.回溯._06_其他;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author kurumi
 * @Date 2026-07-03 上午11:52:20
 * @Description 332. 重新安排行程
 */
public class LeetCode_0332 {
    static class Solution {
        List<String> res = new ArrayList<>();
        Deque<String> path = new LinkedList<>();
        boolean[] visited;

        public List<String> compareList(List<String> a, List<String> b) {
            for (int i = 0; i < a.size(); i++) {
                int num = a.get(i).compareTo(b.get(i));
                if (num < 0)
                    return a;
                else if (num > 0)
                    return b;
            }
            return a;
        }

        public void backtracking(List<List<String>> tickets) {
            if (path.size() == tickets.size() + 1) {
                if (res.isEmpty())
                    res = new ArrayList<>(path);
                else
                    res = compareList(res, new ArrayList(path));
                return;
            }
            for (int i = 0; i < tickets.size(); i++) {
                if (!visited[i] && tickets.get(i).get(0).equals(path.getLast())) {
                    path.offer(tickets.get(i).get(1));
                    visited[i] = true;
                    backtracking(tickets);
                    visited[i] = false;
                    path.removeLast();
                }
            }
        }

        public List<String> findItinerary(List<List<String>> tickets) {
            path.offer("JFK");
            visited = new boolean[tickets.size()];
            Arrays.fill(visited, false);
            backtracking(tickets);
            return res;
        }
    }
}
