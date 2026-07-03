#977. 有序数组的平方
from typing import List

class Solution:
	def sortedSquares(self, nums: List[int]) -> List[int]:
		res=[0 for x in range(len(nums))]
		i=0
		j=len(nums)-1
		k=j
		while i<=j:
			if nums[i]**2>nums[j]**2:
				res[k]=nums[i]**2
				i+=1
			else:
				res[k]=nums[j]**2
				j-=1
			k-=1
		return res

def main():
	nums=[-4,-1,0,3,10]
	solution=Solution()
	print(solution.sortedSquares(nums))

if __name__ == '__main__':
	main()
