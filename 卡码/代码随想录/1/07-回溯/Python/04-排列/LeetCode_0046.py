#46. 全排列
from typing import *

class Solution:
	def __init__(self):
		self.path:List[int]=[]
		self.res:List[List[int]]=[]
		self.visited:List[bool]=[]
	def backtracking(self,nums:List[int]):
		if len(self.path)==len(nums):
			self.res.append(self.path[:])
			return
		for i in range(len(nums)):
			if self.visited[i]:
				continue
			self.visited[i]=True
			self.path.append(nums[i])
			self.backtracking(nums)
			self.path.pop()
			self.visited[i]=False
	def permute(self, nums: List[int]) -> List[List[int]]:
		self.visited=[False]*len(nums)
		self.backtracking(nums)
		return self.res