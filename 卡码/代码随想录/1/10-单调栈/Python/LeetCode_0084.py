#84. 柱状图中最大的矩形
from typing import *

class Solution:
	def largestRectangleArea(self, heights: List[int]) -> int:
		res:int=0
		heights.insert(0,0)
		heights.append(0)
		st:List[int]=[0]
		for i in range(1,len(heights)):
			if heights[i]==heights[st[-1]]:
				st.pop()
			else:
				while heights[i]<heights[st[-1]]:
					mid:int=st.pop()
					if len(st):
						h:int=heights[mid]
						w:int=i-st[-1]-1
						res=max(res,h*w)
			st.append(i)
		return res