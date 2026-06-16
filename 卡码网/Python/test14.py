#14. 句子缩写
import sys

def main():
	n=int(input())
	for i in range(n):
		line=input().split()
		words=list(map(lambda s:s.capitalize(),line))
		for word in words:
			print(word[0],end="")
		print()

if __name__ == '__main__':
	main()
