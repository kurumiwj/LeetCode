#347. 前K个高频元素
from typing import *
import heapq

class Solution:
	def topKFrequent(self, nums: List[int], k: int) -> List[int]:
		m=dict()
		for i in range(len(nums)):
			m[nums[i]]=m.get(nums[i],0)+1
		q=[]
		for key,value in m.items():
			heapq.heappush(q,(value,key))
			#如果小顶堆元素大于k个则弹出
			if len(q)>k:
				heapq.heappop(q)
		res=[0 for x in range(k)]
		for i in range(k-1,-1,-1):
			res[i]=heapq.heappop(q)[1]
		return res