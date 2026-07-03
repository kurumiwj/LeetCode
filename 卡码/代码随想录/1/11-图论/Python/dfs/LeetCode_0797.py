#797. 所有可能的路径
from typing import *

class Solution:
	def __init__(self):
		self.res:List[List[int]]=[]
		self.path:List[int]=[]
	def dfs(self,graph:List[List[int]],index:int):
		if index==len(graph)-1:
			self.res.append(self.path[:])
			return
		for i in range(len(graph[index])):
			self.path.append(graph[index][i])
			self.dfs(graph,graph[index][i])
			self.path.pop()
	def allPathsSourceTarget(self, graph: List[List[int]]) -> List[List[int]]:
		self.path.append(0)
		self.dfs(graph,0)
		return self.res