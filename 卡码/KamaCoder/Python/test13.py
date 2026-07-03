#13. 镂空三角形
import sys

def printSpace(n):
	for i in range(n):
		print(" ",end="")

def printLine(x,n):
	print(x,end="")
	for i in range(n-2):
		print(" ",end="")
	print(x,end="")

def main():
	for line in sys.stdin:
		if line[0]=="@":
			break
		x,n=line.split()
		n=int(n)
		for i in range(1,n+1):
			printSpace(n-i)
			if i==1 or i==n:
				for j in range(2*i-1):
					print(x,end="")
			else:
				printLine(x,2*i-1)
			print()
		print()

if __name__ == '__main__':
	main()
