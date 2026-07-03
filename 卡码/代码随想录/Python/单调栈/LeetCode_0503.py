#503. 下一个更大元素 II
from typing import *

class Solution:
	def nextGreaterElements(self, nums: List[int]) -> List[int]:
		res:List[int]=[-1]*len(nums)
		st:List[int]=[]
		for i in range(len(nums)*2):
			while len(st) and nums[i%len(nums)]>nums[st[-1]]:
				res[st[-1]]=nums[i%len(nums)]
				st.pop()
			st.append(i%len(nums))
		return res