#496. 下一个更大元素 I
from typing import *

class Solution:
	def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
		res:List[int]=[-1]*len(nums1)
		st:List[int]=[]
		m:dict[int,int]=dict()
		for i in range(len(nums1)):
			m[nums1[i]]=i
		for i in range(len(nums2)):
			while len(st) and nums2[i]>nums2[st[-1]]:
				if nums2[st[-1]] in m:
					res[m[nums2[st[-1]]]]=nums2[i]
				st.pop()
			st.append(i)
		return res