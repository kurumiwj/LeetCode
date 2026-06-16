#12. 打印数字图形
import sys

def printSpace(n):
	for i in range(n):
		print(" ",end="")

def printLine(n):
	for i in range(1,n+1):
		print(i,end="")
	for i in range(n-1,0,-1):
		print(i,end="")
	print()

def main():
	for line in sys.stdin:
		n=int(line)
		for i in range(1,n+1):
			printSpace(n-i)
			printLine(i)
		for i in range(n-1,0,-1):
			printSpace(n-i)
			printLine(i)


if __name__ == '__main__':
	main()
