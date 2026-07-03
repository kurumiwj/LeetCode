#695. 岛屿的最大面积
from typing import *

class Solution:
	def __init__(self):
		self.dir:List[tuple[int,int]]=[(0,1),(1,0),(0,-1),(-1,0)]
		self.cnt:int=1
	def dfs(self,grid:List[List[int]],x:int,y:int):
		grid[x][y]=0
		for i in range(4):
			nextX:int=x+self.dir[i][0]
			nextY:int=y+self.dir[i][1]
			if nextX<0 or nextX>len(grid)-1 or nextY<0 or nextY>len(grid[0])-1:
				continue
			if grid[nextX][nextY]==1:
				self.cnt+=1
				self.dfs(grid,nextX,nextY)
	def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
		n,m=len(grid),len(grid[0])
		res:int=0
		for i in range(n):
			for j in range(m):
				if grid[i][j]==1:
					self.cnt=1
					self.dfs(grid,i,j)
					res=max(res,self.cnt)
		return res