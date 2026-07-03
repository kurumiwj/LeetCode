#454. 四数相加 II
from typing import *

class Solution:
	def fourSumCount(self, nums1: List[int], nums2: List[int], nums3: List[int], nums4: List[int]) -> int:
		map=dict()
		sum=0
		for num1 in nums1:
			for num2 in nums2:
				target=num1+num2
				map[target]=map.get(target,0)+1
		for num3 in nums3:
			for num4 in nums4:
				target=-(num3+num4)
				sum+=map.get(target,0)
		return sum