#6. A+B问题VIII
import sys

def main():
	for line in sys.stdin:
		n=int(line)
		for i in range(n):
			nums=list(map(int,sys.stdin.readline().split()))
			print(sum(nums[1:]))
			if i!=n-1:
				print()

if __name__ == '__main__':
	main()
