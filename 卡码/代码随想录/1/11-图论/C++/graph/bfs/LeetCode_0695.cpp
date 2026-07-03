//695. 岛屿的最大面积
#include <iostream>
#include <vector>
#include <queue>
#include <pair>
using namespace std;

class Solution {
	int cnt;
	int dir[4][2]={{0,1},{1,0},{0,-1},{-1,0}};
public:
	void bfs(vector<vector<int>>& grid,int x,int y){
		grid[x][y]=0;
		queue<pair<int,int>> q;
		q.push({x,y});
		while(!q.empty()){
			pair<int,int> v=q.front();
			q.pop();
			for(int i=0;i<4;i++){
				int nextX=v.first+dir[i][0];
				int nextY=v.second+dir[i][1];
				if(nextX<0||nextX>grid.size()-1||nextY<0||nextY>grid[0].size()-1) continue;
				if(grid[nextX][nextY]==1){
					cnt++;
					grid[nextX][nextY]=0;
					q.push({nextX,nextY});
				}
			}
		}
	}
	int maxAreaOfIsland(vector<vector<int>>& grid) {
		int n=grid.size(),m=grid[0].size();
		int res=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(grid[i][j]==1){
					cnt=1;
					bfs(grid,i,j);
					res=max(res,cnt);
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
