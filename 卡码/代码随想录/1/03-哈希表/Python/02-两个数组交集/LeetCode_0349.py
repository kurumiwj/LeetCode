#349. 两个数组的交集
from typing import *

class Solution:
	def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
			hash=set(nums1)
			hash.intersection_update(nums2)
			#return list(hash)
			return list(set(nums1)&set(nums2))