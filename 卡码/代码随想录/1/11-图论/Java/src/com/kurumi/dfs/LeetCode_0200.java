//200. µ∫”Ï ˝¡ø
package com.kurumi.dfs;

public class LeetCode_0200 {

}
class Solution {
	int[][] dir=new int[][] {{0,1},{1,0},{0,-1},{-1,0}};
	public void dfs(char[][] grid,int x,int y) {
		grid[x][y]='0';
		for(int i=0;i<4;i++) {
			int nextX=x+dir[i][0];
			int nextY=y+dir[i][1];
			if(nextX<0||nextX>=grid.length||nextY<0||nextY>=grid[0].length) continue;
			if(grid[nextX][nextY]=='1') {
				grid[nextX][nextY]='0';
				dfs(grid,nextX,nextY);
			}
		}
	}
  public int numIslands(char[][] grid) {
    int n=grid.length;
    int m=grid[0].length;
    int res=0;
    for(int i=0;i<n;i++) {
    	for(int j=0;j<m;j++) {
    		if(grid[i][j]=='1') {
    			res++;
    			dfs(grid,i,j);
    		}
    	}
    }
    return res;
  }
}