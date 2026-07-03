#27. 移除元素
from typing import List

class Solution:
	def removeElement(self, nums: List[int], val: int) -> int:
		slow=0
		for fast in range(len(nums)):
			if nums[fast]!=val:
				nums[slow]=nums[fast]
				slow+=1
		return slow

def main():
	nums=[0,1,2,2,3,0,4,2]
	print(Solution.removeElement(nums,2))

if __name__ == '__main__':
	main()
