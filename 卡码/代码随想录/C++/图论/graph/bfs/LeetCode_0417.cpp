//417. 太平洋大西洋水流问题
#include <iostream>
#include <vector>
#include <queue>
#include <pair>
using namespace std;

class Solution {
	int dir[4][2]={{0,1},{1,0},{0,-1},{-1,0}};
	vector<vector<vector<bool>>> visited;
	queue<vector<int>> q;
public:
	void bfs(vector<vector<int>>& heights){	//0表示太平洋，1表示大西洋
		while(!q.empty()){
			vector<int> v=q.front();
			q.pop();
			for(int i=0;i<4;i++){
				int x=v[0]+dir[i][0];
				int y=v[1]+dir[i][1];
				if(x<0||x>heights.size()-1||y<0||y>heights[0].size()-1) continue;
				if(heights[x][y]<heights[v[0]][v[1]]||visited[v[2]][x][y]) continue;
				visited[v[2]][x][y]=true;
				q.push({x,y,v[2]});
			}
		}
	}
	vector<vector<int>> pacificAtlantic(vector<vector<int>>& heights) {
		int n=heights.size(),m=heights[0].size();
		visited.resize(2,vector<vector<bool>>(n,vector<bool>(m,false)));
		vector<vector<int>> res;
		for(int i=0;i<n;i++){
			visited[0][i][0]=true;
			visited[1][i][m-1]=true;
			q.push({i,0,0});
			q.push({i,m-1,1});
		}
		for(int j=0;j<m;j++){
			visited[0][0][j]=true;
			visited[1][n-1][j]=true;
			q.push({0,j,0});
			q.push({n-1,j,1});
		}
		bfs(heights);
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(visited[0][i][j]&&visited[1][i][j]) res.push_back({i,j});
			}
		}
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
