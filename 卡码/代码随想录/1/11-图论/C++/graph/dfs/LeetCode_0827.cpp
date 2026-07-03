//827. 最大人工岛
#include <iostream>
#include <vector>
#include <unordered_map>
#include <unordered_set>
using namespace std;

class Solution {
	int dir[4][2]={{0,1},{1,0},{0,-1},{-1,0}};
	int cnt=0;
public:
	void dfs(vector<vector<int>>& grid,int x,int y,int mark){
		grid[x][y]=mark;
		cnt++;
		for(int i=0;i<4;i++){
			int nextX=x+dir[i][0];
			int nextY=y+dir[i][1];
			if(nextX<0||nextX>grid.size()-1||nextY<0||nextY>grid[0].size()-1) continue;
			if(grid[nextX][nextY]==0||grid[nextX][nextY]>1) continue;
			dfs(grid,nextX,nextY,mark);
		}
	}
	int largestIsland(vector<vector<int>>& grid) {
		int n=grid.size(),m=grid[0].size();
		unordered_map<int,int> areas;
		int mark=2;
		bool isAllLand=true;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(grid[i][j]==0) isAllLand=false;
				if(grid[i][j]==1){
					cnt=0;
					dfs(grid,i,j,mark);
					areas[mark]=cnt;
					mark++;
				}
			}
		}
		if(isAllLand) return n*m;
		int res=0;
		unordered_set<int> visited;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				int count=1;
				visited.clear();
				if(grid[i][j]==0){
					for(int k=0;k<4;k++){
						int x=i+dir[k][0];
						int y=j+dir[k][1];
						if(x<0||x>n-1||y<0||y>m-1) continue;
						if(grid[x][y]>1){
							if(visited.count(grid[x][y])) continue;
							count+=areas[grid[x][y]];
							visited.insert(grid[x][y]);
						}
					}
				}
				res=max(res,count);
			}
		}
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
