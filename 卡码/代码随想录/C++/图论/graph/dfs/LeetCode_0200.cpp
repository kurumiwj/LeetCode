//200. 岛屿数量
#include <iostream>
#include <vector>
using namespace std;

class Solution {
	int dir[4][2]={{0,1},{1,0},{0,-1},{-1,0}};
public:
	void dfs(vector<vector<char>>& grid,int x,int y){
		grid[x][y]='0';
		for(int i=0;i<4;i++){
			int nextX=x+dir[i][0];
			int nextY=y+dir[i][1];
			if(nextX<0||nextX>=grid.size()||nextY<0||nextY>=grid[0].size()) continue;
			if(grid[nextX][nextY]=='1'){
				dfs(grid,nextX,nextY);
			}
		}
	}
	int numIslands(vector<vector<char>>& grid) {
		int n=grid.size(),m=grid[0].size(),res=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(grid[i][j]=='1'){
					res++;
					dfs(grid,i,j);
				}
			}
		}
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
