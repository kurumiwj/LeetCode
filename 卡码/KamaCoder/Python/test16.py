#16. 位置互换
import sys

def reverse(str):
	res=""
	for i in range(0,len(str),2):
		res+=str[i+1]+str[i]
	return res

def main():
	n=int(input())
	for i in range(n):
		str=input()
		print(reverse(str))

if __name__ == '__main__':
	main()
