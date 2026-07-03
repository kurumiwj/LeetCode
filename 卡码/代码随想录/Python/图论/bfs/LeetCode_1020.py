#1020. 飞地的数量
from typing import *
from collections import deque

class Solution:
	def __init__(self):
		self.cnt:int=0
		self.dir:List[tuple[int,int]]=[(0,1),(1,0),(0,-1),(-1,0)]
	def bfs(self,grid:List[List[int]],x:int,y:int):
		grid[x][y]=0
		self.cnt+=1
		q:deque[tuple[int,int]]=deque()
		q.append((x,y))
		while len(q)>0:
			v:tuple[int,int]=q.pop()
			for i in range(4):
				x1:int=v[0]+self.dir[i][0]
				y1:int=v[1]+self.dir[i][1]
				if x1<0 or x1>len(grid)-1 or y1<0 or y1>len(grid[0])-1:
					continue
				if grid[x1][y1]==1:
					self.cnt+=1
					grid[x1][y1]=0
					q.append((x1,y1))
	def numEnclaves(self, grid: List[List[int]]) -> int:
		n,m=len(grid),len(grid[0])
		for i in range(n):
			if grid[i][0]==1:
				self.bfs(grid,i,0)
			if grid[i][m-1]==1:
				self.bfs(grid,i,m-1)
		for j in range(m):
			if grid[0][j]==1:
				self.bfs(grid,0,j)
			if grid[n-1][j]==1:
				self.bfs(grid,n-1,j)
		self.cnt=0
		for i in range(n):
			for j in range(m):
				if grid[i][j]==1:
					self.bfs(grid,i,j)
		return self.cnt