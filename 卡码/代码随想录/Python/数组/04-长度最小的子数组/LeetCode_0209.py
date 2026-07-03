#209. 长度最小的子数组
from typing import List

class Solution:
	def minSubArrayLen(self, target: int, nums: List[int]) -> int:
		i,sum,res=0,0,len(nums)+1
		for j in range(len(nums)):
			sum+=nums[j]
			while sum>=target:
				res=min(res,j-i+1)
				sum-=nums[i]
				i+=1
		return res if res!=len(nums)+1 else 0

def main():
	target=7
	nums=[2,3,1,2,4,3]
	solution=Solution()
	print(solution.minSubArrayLen(target,nums))

if __name__ == '__main__':
	main()
