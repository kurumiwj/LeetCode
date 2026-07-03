#200. 岛屿数量
from typing import *
from collections import deque

class Solution:
	def __init__(self):
		self.dir:List[List[int]]=[[0,1],[1,0],[0,-1],[-1,0]]
	def bfs(self,grid,x,y):
		grid[x][y]="0"
		q:deque[int]=deque()
		q.append((x,y))
		while len(q)!=0:
			v:tuple[int,int]=q.popleft()
			for i in range(4):
				nextX:int=v[0]+self.dir[i][0]
				nextY:int=v[1]+self.dir[i][1]
				if nextX<0 or nextX>len(grid)-1 or nextY<0 or nextY>len(grid[0])-1:
					continue
				if grid[nextX][nextY]=="1":
					grid[nextX][nextY]="0"
					q.append((nextX,nextY))
	def numIslands(self, grid: List[List[str]]) -> int:
		res:int=0
		n,m=len(grid),len(grid[0])
		for i in range(n):
			for j in range(m):
				if grid[i][j]=="1":
					res+=1
					self.bfs(grid,i,j)
		return res