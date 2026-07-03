//51. N 皇后
#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

class Solution {
	vector<vector<string>> res;
	vector<string> chess;
public:
	bool isValid(int row,int col,int n){
		for(int i=0;i<row;i++)
			if(chess[i][col]=='Q') return false;
		for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
			if(chess[i][j]=='Q') return false;
		for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++)
			if(chess[i][j]=='Q') return false;
		return true;
	}
	void backtracking(int row,int n){
		if(row==n){
			res.push_back(chess);
			return;
		}
		for(int col=0;col<n;col++){
			if(isValid(row,col,n)){
				chess[row][col]='Q';
				backtracking(row+1,n);
				chess[row][col]='.';
			}
		}
	}
	vector<vector<string>> solveNQueens(int n) {
		chess.resize(n,string(n,'.'));
		backtracking(0,n);
		return res;
	}
};

int main(){
  system("pause");
  return 0;
}
