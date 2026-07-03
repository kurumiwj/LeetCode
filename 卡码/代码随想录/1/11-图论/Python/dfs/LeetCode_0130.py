#130. 被围绕的区域
from typing import *

class Solution:
	def __init__(self):
		self.dir:List[List[int]]=[[0,1],[1,0],[0,-1],[-1,0]]
	def dfs(self,board: List[List[str]],x:int,y:int):
		board[x][y]="Y"
		for i in range(4):
			nextX:int=x+self.dir[i][0]
			nextY:int=y+self.dir[i][1]
			if nextX<0 or nextX>len(board)-1 or nextY<0 or nextY>len(board[0])-1:
				continue
			if board[nextX][nextY]=="O":
				self.dfs(board,nextX,nextY)
	def solve(self, board: List[List[str]]) -> None:
		n,m=len(board),len(board[0])
		for i in range(n):
			if board[i][0]=="O":
				self.dfs(board,i,0)
			if board[i][m-1]=="O":
				self.dfs(board,i,m-1)
		for j in range(m):
			if board[0][j]=="O":
				self.dfs(board,0,j)
			if board[n-1][j]=="O":
				self.dfs(board,n-1,j)
		for i in range(n):
			for j in range(m):
				if board[i][j]=="O":
					board[i][j]="X"
				if board[i][j]=="Y":
					board[i][j]="O"