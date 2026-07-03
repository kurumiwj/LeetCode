#42. 接雨水
from typing import *

class Solution:
	def trap(self, height: List[int]) -> int:
		res:int=0
		st:List[int]=[]
		for i in range(len(height)):
			while len(st) and height[i]>height[st[-1]]:
				low:int=st.pop()
				if len(st):
					h:int=min(height[i],height[st[-1]])-height[low]
					w:int=i-st[-1]-1
					res+=h*w
			st.append(i)
		return res