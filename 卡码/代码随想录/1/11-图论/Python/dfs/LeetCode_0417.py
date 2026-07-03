#417. 太平洋大西洋水流问题
from typing import *

class Solution:
	def __init__(self):
		self.dir:List[List[int]]=[[0,1],[1,0],[0,-1],[-1,0]]
		self.visited:List[List[List[bool]]]=[]
	def dfs(self,heights:List[List[int]],x:int,y:int,flag:int):
		self.visited[flag][x][y]=True
		for i in range(4):
			nextX,nextY=x+self.dir[i][0],y+self.dir[i][1]
			if nextX<0 or nextX>len(heights)-1 or nextY<0 or nextY>len(heights[0])-1:
				continue
			if self.visited[flag][nextX][nextY] or heights[nextX][nextY]<heights[x][y]:
				continue
			self.dfs(heights,nextX,nextY,flag)
	def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
		n,m=len(heights),len(heights[0])
		self.visited=[[[False]*m for _ in range(n)] for _ in range(2)]
		for i in range(n):
			self.dfs(heights,i,0,0)
			self.dfs(heights,i,m-1,1)
		for j in range(m):
			self.dfs(heights,0,j,0)
			self.dfs(heights,n-1,j,1)
		res:List[List[int]]=[]
		for i in range(n):
			for j in range(m):
				if self.visited[0][i][j] and self.visited[1][i][j]:
					res.append([i,j])
		return res