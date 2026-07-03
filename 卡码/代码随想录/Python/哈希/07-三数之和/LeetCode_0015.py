#15. 三数之和
from typing import *

class Solution:
	def threeSum(self, nums: List[int]) -> List[List[int]]:
		res=[]
		nums.sort()
		for i in range(len(nums)-2):
			n1=nums[i]
			if n1>0:
				break
			if i>0 and nums[i]==nums[i-1]:
				continue
			left,right=i+1,len(nums)-1
			while left<right:
				n2,n3=nums[left],nums[right]
				if n1+n2+n3==0:
					res.append([n1,n2,n3])
					while left<right and nums[left]==n2:
						left+=1
					while left<right and nums[right]==n3:
						right-=1
				elif n1+n2+n3<0:
					left+=1
				else:
					right-=1
		return res