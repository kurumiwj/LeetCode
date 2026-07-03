#202. 快乐数
from typing import *

class Solution:
	def getSum(self,n:int)->int:
		sum=0
		while n>0:
			sum+=(n%10)**2
			n//=10
		return sum
	def isHappy(self, n: int) -> bool:
		s=set()
		while n!=1 and n not in s:
			s.add(n)
			n=self.getSum(n)
		return n==1