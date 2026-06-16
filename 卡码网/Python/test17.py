#17. 出栈合法性
import sys

def main():
	for line in sys.stdin:
		n=int(line)
		if n==0:
			break
		nums=list(map(int,input().split(" ")))
		stack=[]
		index=0
		for i in range(1,n+1):
			stack.append(i)
			while len(stack)!=0 and stack[-1]==nums[index]:
				stack.pop()
				index+=1
		if len(stack)==0 and index==n:
			print("Yes")
		else:
			print("No")

if __name__ == '__main__':
	main()
