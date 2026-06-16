#11. 共同祖先
import sys

def main():
	for line in sys.stdin:
		n=int(line)
		commons=[0 for x in range (21)]
		for i in range(n):
			[a,b]=list(map(int,input().split()))
			commons[a]=b
		height1,height2=0,0
		start1,start2=1,2
		while commons[start1]!=0:
			height1+=1
			start1=commons[start1]
		while commons[start2]!=0:
			height2+=1
			start2=commons[start2]
		if height1>height2:
			print("You are my elder")
		elif height1<height2:
			print("You are my younger")
		else:
			print("You are my brother")

if __name__ == '__main__':
	main()
