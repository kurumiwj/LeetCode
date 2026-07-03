#739. 每日温度
from typing import *

class Solution:
	def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
		res:List[int]=[0]*len(temperatures)
		st:List[int]=[]
		for i in range(len(temperatures)):
			while len(st) and temperatures[i]>temperatures[st[-1]]:
				res[st[-1]]=i-st[-1]
				st.pop()
			st.append(i)
		return res