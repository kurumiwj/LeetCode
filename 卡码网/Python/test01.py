#1. A+B问题I
import sys

def main():
	for line in sys.stdin:
		a,b=map(int,line.split())
		print(a+b)

def main1():
	while True:
		try:
			a,b=map(int,input().split())
			print(a+b)
		except:
			break

if __name__=="__main__":
	main1()