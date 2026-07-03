#134. 加油站
from typing import *

class Solution:
	def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
		start,current,total=0,0,0
		for i in range(len(gas)):
			current+=(gas[i]-cost[i])
			total+=(gas[i]-cost[i])
			if current<0:
				current=0
				start=i+1
		if total<0:
			return -1
		return start