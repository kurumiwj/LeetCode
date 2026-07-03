//827. 最大人工岛
package com.kurumi.bfs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class LeetCode_0827 {

}
class Solution {
	int[][] dir=new int[][] {{0,1},{1,0},{0,-1},{-1,0}};
	Deque<Integer> q=new ArrayDeque<>();
	public int bfs(int[][] grid,int mark) {
		int cnt=1;
		while(!q.isEmpty()) {
			int x=q.poll();
			int y=q.poll();
			for(int i=0;i<4;i++) {
				int nextX=x+dir[i][0];
				int nextY=y+dir[i][1];
				if(nextX<0||nextX>grid.length-1||nextY<0||nextY>grid[0].length-1) continue;
				if(grid[nextX][nextY]==0||grid[nextX][nextY]>1) continue;
				q.offer(nextX);
				q.offer(nextY);
				cnt++;
				grid[nextX][nextY]=mark;
			}
		}
		return cnt;
	}
  public int largestIsland(int[][] grid) {
  	int n=grid.length;
  	int m=grid[0].length;
  	HashMap<Integer,Integer> areas = new HashMap<>();
  	int mark=2;
  	boolean isAllLand=true;
  	for(int i=0;i<n;i++) {
  		for(int j=0;j<m;j++) {
  			if(grid[i][j]==0) isAllLand=false;
  			if(grid[i][j]==1) {
  				q.offer(i);
  				q.offer(j);
  				grid[i][j]=mark;
  				int cnt=bfs(grid,mark);
  				areas.put(mark,cnt);
  				mark++;
  			}
  		}
  	}
  	if(isAllLand) return n*m;
  	int res=0;
  	HashSet<Integer> visited=new HashSet<>();
  	for(int i=0;i<n;i++) {
  		for(int j=0;j<m;j++) {
  			int count=1;
  			visited.clear();
  			if(grid[i][j]==0) {
  				for(int k=0;k<4;k++) {
  					int x=i+dir[k][0];
  					int y=j+dir[k][1];
  					if(x<0||x>n-1||y<0||y>m-1) continue;
  					if(grid[x][y]>1) {
  						if(visited.contains(grid[x][y])) continue;
  						count+=areas.get(grid[x][y]);
  						visited.add(grid[x][y]);
  					}
  				}
  			}
  			res=Math.max(res,count);
  		}
  	}
  	return res;
  }
}