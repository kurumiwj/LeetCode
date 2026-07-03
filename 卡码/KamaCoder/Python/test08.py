#8. 摆平积木
import sys
from functools import reduce

def main():
	for line in sys.stdin:
		n=int(line)
		if n==0:
			break
		nums=list(map(int,sys.stdin.readline().split()))
		total=sum(nums)
		avg=total/n
		res=0
		for num in nums:
			if num>avg:
				res+=num-avg
		print(int(res))
		print()

if __name__ == '__main__':
	main()
