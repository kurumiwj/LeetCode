//841. Ô¿³×ºÍ·¿¼ä
package com.kurumi.dfs;

import java.util.List;

public class LeetCode_0841 {

}
class Solution {
	boolean[] visited;
	void dfs(List<List<Integer>> rooms,int key) {
		if(visited[key]) return;
		visited[key]=true;
		List<Integer> keys = rooms.get(key);
		for(int k:keys) {
			if(!visited[k]) dfs(rooms,k);
		}
	}
  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
  	visited=new boolean[rooms.size()];
  	dfs(rooms,0);
  	for(boolean visit:visited) {
  		if(!visit) return false;
  	}
  	return true;
  }
}