//463. 岛屿的周长
#include <iostream>
#include <vector>
using namespace std;

class Solution {
	int dir[4][2]={{0,1},{1,0},{0,-1},{-1,0}};
public:
	int islandPerimeter(vector<vector<int>>& grid) {
		int n=grid.size(),m=grid[0].size();
		int res=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(grid[i][j]==1){
					for(int k=0;k<4;k++){
						int x=i+dir[k][0],y=j+dir[k][1];
						if(x<0||x>n-1||y<0||y>m-1||grid[x][y]==0) res++;
					}
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
