//417. 太平洋大西洋水流问题
#include <iostream>
#include <vector>
using namespace std;

class Solution {
	int dir[4][2]={{0,1},{1,0},{0,-1},{-1,0}};
	vector<vector<bool>> pacific;
	vector<vector<bool>> atlantic;
public:
	void dfs(vector<vector<int>>& heights,int x,int y,int flag){	//0表示太平洋，1表示大西洋
		if(flag==0&&pacific[x][y]||flag==1&&atlantic[x][y]) return;
		if(flag==0) pacific[x][y]=true;
		else atlantic[x][y]=true;
		for(int i=0;i<4;i++){
			int nextX=x+dir[i][0];
			int nextY=y+dir[i][1];
			if(nextX<0||nextX>heights.size()-1||nextY<0||nextY>heights[0].size()-1) continue;
			if(heights[nextX][nextY]<heights[x][y]) continue;
			dfs(heights,nextX,nextY,flag);
		}
	}
	vector<vector<int>> pacificAtlantic(vector<vector<int>>& heights) {
		int n=heights.size(),m=heights[0].size();
		pacific.resize(n,vector<bool>(m,false));
		atlantic.resize(n,vector<bool>(m,false));
		vector<vector<int>> res;
		for(int i=0;i<n;i++){
			dfs(heights,i,0,0);
			dfs(heights,i,m-1,1);
		}
		for(int j=0;j<m;j++){
			dfs(heights,0,j,0);
			dfs(heights,n-1,j,1);
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(pacific[i][j]&&atlantic[i][j]) res.push_back({i,j});
			}
		}
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
