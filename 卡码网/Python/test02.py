#2. A+B问题II
import sys

def main():
	for line in sys.stdin:
		n=int(line)
		for i in range(n):
			[a,b]=map(int,sys.stdin.readline().split())
			print(a+b)

if __name__=="__main__":
	main()