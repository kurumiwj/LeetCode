//797. 所有可能的路径
package com.kurumi.dfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_0797 {

}
class Solution {
	List<List<Integer>> res=new ArrayList<>();
	Deque<Integer> path=new ArrayDeque();
	public void dfs(int[][]graph,int index) {
		if(index==graph.length-1) {
			res.add(new ArrayList<>(path));
			return;
		}
		for(int i=0;i<graph[index].length;i++) {
			path.offer(graph[index][i]);
			dfs(graph,graph[index][i]);
			path.pollLast();
		}
	}
  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
  	path.add(0);
  	dfs(graph,0);
  	return res;
  }
}