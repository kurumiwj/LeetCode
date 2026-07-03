#704. 二分查找
class Solution:
	def search(self, nums: List[int], target: int) -> int:
		left=0
		right=len(nums)-1
		while left<=right:
			middle=(left+right)//2
			if nums[middle]==target:
				return middle
			elif target<nums[middle]:
				right=middle-1
			else:
				left=middle+1
		return -1

def main():
	nums=[-1,0,3,5,9,12]
	solution=Solution
	print(solution.search(nums,9))
	print(solution.search(nums,2))
	print(solution.search(nums,13))

if __name__ == '__main__':
	main()
