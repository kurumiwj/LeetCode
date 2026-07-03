//37. 解数独
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
	bool isValid(int row,int col,char ch,vector<vector<char>>& board){
		for(int i=0;i<9;i++)
			if(board[row][i]==ch||board[i][col]==ch) return false;
		int startRow=(row/3)*3;
		int startCol=(col/3)*3;
		for(int i=startRow;i<startRow+3;i++)
			for(int j=startCol;j<startCol+3;j++)
				if(board[i][j]==ch) return false;
		return true;
	}
	bool backtracking(vector<vector<char>>& board){
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(board[i][j]=='.'){
					for(char k='1';k<='9';k++){
						if(isValid(i,j,k,board)){
							board[i][j]=k;
							if(backtracking(board)) return true;
							board[i][j]='.';
						}
					}
					return false;
				}
			}
		}
		return true;
	}
	void solveSudoku(vector<vector<char>>& board) {
		backtracking(board);
	}
};

int main(){
  system("pause");
  return 0;
}
