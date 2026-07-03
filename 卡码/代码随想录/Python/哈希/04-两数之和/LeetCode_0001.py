#1. 两数之和
from typing import *

class Solution:
	def twoSum(self, nums: List[int], target: int) -> List[int]:
		map=dict()
		for index,value in enumerate(nums):
			if target-value in map:
				return [index,map[target-value]]
			else:
				map[value]=index
		return []