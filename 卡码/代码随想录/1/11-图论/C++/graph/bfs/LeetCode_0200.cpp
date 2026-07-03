//200. 岛屿数量
#include <iostream>
#include <vector>
#include <queue>
#include <pair>
using namespace std;

class Solution {
	int dir[4][2]={{0,1},{1,0},{0,-1},{-1,0}};
public:
	void bfs(vector<vector<char>>& grid,int x,int y){
		queue<pair<int,int>> q;
		q.push({x,y});
		grid[x][y]='0';
		while(!q.empty()){
			pair<int,int> v=q.front();
			q.pop();
			for(int i=0;i<4;i++){
				int nextX=v.first+dir[i][0];
				int nextY=v.second+dir[i][1];
				if(nextX<0||nextX>grid.size()-1||nextY<0||nextY>grid[0].size()-1) continue;
				if(grid[nextX][nextY]=='1'){
					q.push({nextX,nextY});
					grid[nextX][nextY]='0';
				}
			}
		}
	}
	int numIslands(vector<vector<char>>& grid) {
		int n=grid.size(),m=grid[0].size(),res=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(grid[i][j]=='1'){
					res++;
					bfs(grid,i,j);
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
