//1020. 飞地的数量
#include <iostream>
#include <vector>
using namespace std;

class Solution {
	int cnt;
	int dir[4][2]={{0,1},{1,0},{0,-1},{-1,0}};
public:
	void dfs(vector<vector<int>>& grid,int x,int y){
		grid[x][y]=0;
		cnt++;
		for(int i=0;i<4;i++){
			int x1=x+dir[i][0];
			int y1=y+dir[i][1];
			if(x1<0||x1>grid.size()-1||y1<0||y1>grid[0].size()-1) continue;
			if(grid[x1][y1]==1){
				dfs(grid,x1,y1);
			}
		}
	}
	int numEnclaves(vector<vector<int>>& grid) {
		if(grid.size()==0) return 0;
		int n=grid.size(),m=grid[0].size();
		for(int i=0;i<n;i++){
			if(grid[i][0]==1) dfs(grid,i,0);
			if(grid[i][m-1]==1) dfs(grid,i,m-1);
		}
		for(int j=0;j<m;j++){
			if(grid[0][j]==1) dfs(grid,0,j);
			if(grid[n-1][j]==1) dfs(grid,n-1,j);
		}
		cnt=0;
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				if(grid[i][j]==1) dfs(grid,i,j);
		return cnt;
	}
};

int main(){
  system("pause");
  return 0;
}
