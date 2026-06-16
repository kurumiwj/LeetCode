#19. 单链表反转
import sys

def main():
	for line in sys.stdin:
		nums=list(map(int,line.split()))
		if nums[0]==0:
			print("list is empty")
		else:
			for i in range(1,nums[0]+1):
				if i!=1:
					print(" ",end="")
				print(nums[i],end="")
			print()
			for i in range(nums[0],0,-1):
				if i!=nums[0]:
					print(" ",end="")
				print(nums[i],end="")
			print()

if __name__ == '__main__':
	main()
