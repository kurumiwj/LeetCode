//130. 被围绕的区域
#include <iostream>
#include <vector>
using namespace std;

class Solution {
	int dir[4][2]={{0,1},{1,0},{0,-1},{-1,0}};
public:
	void dfs(vector<vector<char>>& board,int x,int y){
		board[x][y]='Y';	//标记为Y的点是要保留的点
		for(int i=0;i<4;i++){
			int x1=x+dir[i][0];
			int y1=y+dir[i][1];
			if(x1<0||x1>board.size()-1||y1<0||y1>board[0].size()-1) continue;
			if(board[x1][y1]=='O') dfs(board,x1,y1);
		}
	}
	void solve(vector<vector<char>>& board) {
		int n=board.size(),m=board[0].size();
		for(int i=0;i<n;i++){
			if(board[i][0]=='O') dfs(board,i,0);
			if(board[i][m-1]=='O') dfs(board,i,m-1);
		}
		for(int j=0;j<m;j++){
			if(board[0][j]=='O') dfs(board,0,j);
			if(board[n-1][j]=='O') dfs(board,n-1,j);
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(board[i][j]=='O') board[i][j]='X';
				if(board[i][j]=='Y') board[i][j]='O';
			}
		}
	}
};

int main(){
  system("pause");
  return 0;
}
