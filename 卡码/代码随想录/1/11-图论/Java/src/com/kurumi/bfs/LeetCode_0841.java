//841. Ô¿³×ºÍ·¿¼ä
package com.kurumi.bfs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class LeetCode_0841 {

}
class Solution {
	boolean bfs(List<List<Integer>> rooms) {
		boolean[] visited=new boolean[rooms.size()];
		Deque<Integer> q=new ArrayDeque<>();
		visited[0]=true;
		q.offer(0);
		while(!q.isEmpty()) {
			int key = q.poll();
			List<Integer> keys = rooms.get(key);
			for(int k:keys) {
				if(!visited[k]) {
					visited[k]=true;
					q.offer(k);
				}
			}
		}
		for(boolean visit:visited) {
			if(!visit) return false;
		}
		return true;
	}
  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
  	return bfs(rooms);
  }
}