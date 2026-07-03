#695. 岛屿的最大面积
from typing import *
from collections import deque

class Solution:
	def __init__(self):
		self.dir:List[tuple[int,int]]=[(0,1),(1,0),(0,-1),(-1,0)]
		self.cnt:int=1
	def bfs(self,grid:List[List[int]],x:int,y:int):
		grid[x][y]=0
		q:deque[tuple[int,int]]=deque()
		q.append((x,y))
		while len(q)>0:
			v:tuple[int,int]=q.pop()
			for i in range(4):
				nextX:int=v[0]+self.dir[i][0]
				nextY:int=v[1]+self.dir[i][1]
				if nextX<0 or nextX>len(grid)-1 or nextY<0 or nextY>len(grid[0])-1:
					continue
				if grid[nextX][nextY]==1:
					self.cnt+=1
					grid[nextX][nextY]=0
					q.append((nextX,nextY))
	def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
		n,m=len(grid),len(grid[0])
		res:int=0
		for i in range(n):
			for j in range(m):
				if grid[i][j]==1:
					self.cnt=1
					self.bfs(grid,i,j)
					res=max(res,self.cnt)
		return res