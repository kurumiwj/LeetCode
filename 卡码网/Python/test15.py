#15. 神秘字符
import sys

def merge(str1,str2):
	middle=len(str1)//2
	return str1[:middle]+str2+str1[middle:]

def main():
	n=int(input())
	for i in range(n):
		str1=input()
		str2=input()
		print(merge(str1,str2))

if __name__ == '__main__':
	main()
