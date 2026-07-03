//417. 太平洋大西洋水流问题
package com.kurumi.bfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class LeetCode_0417 {

}
class Solution {
	int[][] dir=new int[][] {{0,1},{1,0},{0,-1},{-1,0}};
	boolean[][][] visited;
	Deque<int[]> q=new ArrayDeque<>();
	public void bfs(int[][] heights) {
		while(!q.isEmpty()) {
			int[] v = q.poll();
			for(int i=0;i<4;i++) {
				int x=v[1]+dir[i][0];
				int y=v[2]+dir[i][1];
				if(x<0||x>heights.length-1||y<0||y>heights[0].length-1) continue;
				if(visited[v[0]][x][y]||heights[x][y]<heights[v[1]][v[2]]) continue;
				visited[v[0]][x][y]=true;
				q.offer(new int[] {v[0],x,y});
			}
		}
	}
  public List<List<Integer>> pacificAtlantic(int[][] heights) {
  	int n=heights.length;
  	int m=heights[0].length;
  	List<List<Integer>> res=new ArrayList<>();
  	visited=new boolean[2][n][m];
  	for(int i=0;i<n;i++) {
  		visited[0][i][0]=true;
  		visited[1][i][m-1]=true;
  		q.offer(new int[] {0,i,0});
  		q.offer(new int[] {1,i,m-1});
  	}
  	for(int j=0;j<m;j++) {
  		visited[0][0][j]=true;
  		visited[1][n-1][j]=true;
  		q.offer(new int[] {0,0,j});
  		q.offer(new int[] {1,n-1,j});
  	}
  	bfs(heights);
  	for(int i=0;i<n;i++) {
  		for(int j=0;j<m;j++) {
  			if(visited[0][i][j]&&visited[1][i][j]) res.add(Arrays.asList(i,j));
  		}
  	}
  	return res;
  }
}