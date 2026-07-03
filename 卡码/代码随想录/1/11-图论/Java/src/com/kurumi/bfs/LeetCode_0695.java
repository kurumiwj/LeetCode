//695. 岛屿的最大面积
package com.kurumi.bfs;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode_0695 {

}
class Solution {
	int[][] dir=new int[][] {{0,1},{1,0},{0,-1},{-1,0}};
	int cnt;
	public void bfs(int[][] grid,int x,int y) {
		grid[x][y]=0;
		Deque<int[]> q=new ArrayDeque<>();
		q.offer(new int[] {x,y});
		while(!q.isEmpty()) {
			int[] v=q.poll();
			for(int i=0;i<4;i++) {
				int nextX=v[0]+dir[i][0];
				int nextY=v[1]+dir[i][1];
				if(nextX<0||nextX>grid.length-1||nextY<0||nextY>grid[0].length-1) continue;
				if(grid[nextX][nextY]==1) {
					cnt++;
					grid[nextX][nextY]=0;
					q.offer(new int[] {nextX,nextY});
				}
			}
		}
	}
  public int maxAreaOfIsland(int[][] grid) {
  	int n=grid.length;
  	int m=grid[0].length;
  	int res=0;
  	for(int i=0;i<n;i++) {
  		for(int j=0;j<m;j++) {
  			if(grid[i][j]==1) {
  				cnt=1;
  				bfs(grid,i,j);
  				res=Math.max(res,cnt);
  			}
  		}
  	}
  	return res;
  }
}