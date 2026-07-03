#18. 四数之和
from typing import *

class Solution:
	def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
		res=[]
		nums.sort()
		for k in range(len(nums)-3):
			if nums[k]>target and nums[k]>=0:
				break
			if k>0 and nums[k]==nums[k-1]:
				continue
			for i in range(k+1,len(nums)-2):
				if nums[k]+nums[i]>target and nums[i]>=0:
					break
				if i>k+1 and nums[i]==nums[i-1]:
					continue
				left,right=i+1,len(nums)-1
				while left<right:
					n1,n2=nums[left],nums[right]
					if nums[k]+nums[i]+n1+n2==target:
						res.append([nums[k],nums[i],n1,n2])
						while left<right and nums[left]==n1:
							left+=1
						while left<right and nums[right]==n2:
							right-=1
					elif nums[k]+nums[i]+n1+n2<target:
						left+=1
					else:
						right-=1
		return res