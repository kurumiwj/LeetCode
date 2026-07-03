#10. 运营商活动
import sys
def main():
	for line in sys.stdin:
		[m,k]=list(map(int,line.split()))
		if m==0 and k==0:
			break
		total=m
		while m>=k:
			left=m//k
			total+=left
			m=left+m%k
		print(total)

if __name__ == '__main__':
	main()
