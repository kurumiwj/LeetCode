#59. 螺旋矩阵 II
from typing import *

class Solution:
	def generateMatrix(self, n: int) -> List[List[int]]:
		startX:int=0
		startY:int=0
		count:int=1
		offset:int=1
		loop:int=n//2
		nums:List[List[int]]=[[0 for x in range(n)] for x in range(n)]
		while loop>0:
			i:int=startX
			j:int=startY
			for j in range(startY,n-offset):
				nums[i][j]=count
				count+=1
			j+=1
			for i in range(startX,n-offset):
				nums[i][j]=count
				count+=1
			i+=1
			for j in range(j,startY,-1):
				nums[i][j]=count
				count+=1
			j-=1
			for i in range(i,startX,-1):
				nums[i][j]=count
				count+=1
			i-=1
			startX+=1
			startY+=1
			offset+=1
			loop-=1
		if n%2!=0:
			nums[n//2][n//2]=count
		return nums

	def printNums(self,nums:List[List[int]]):
		for num in nums:
			print(*num)

def main():
	solution:Solution=Solution()
	nums:List[List[int]]=solution.generateMatrix(5)
	solution.printNums(nums)

if __name__=="__main__":
	main()