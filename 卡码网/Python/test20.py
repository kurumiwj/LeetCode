#20. 删除重复元素
import sys

def main():
	for line in sys.stdin:
		nums=list(map(int,line.split()))
		if nums[0]==0:
			print("list is empty")
			continue
		for i in range(1,len(nums)):
			if i!=1:
				print(" ",end="")
			print(nums[i],end="")
		print()
		nums=list(set(nums[1:]))
		for i in range(len(nums)):
			if i!=0:
				print(" ",end="")
			print(nums[i],end="")
		print()

if __name__ == '__main__':
	main()
