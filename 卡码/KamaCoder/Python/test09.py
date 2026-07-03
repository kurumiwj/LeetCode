#9. 奇怪的信
import sys

def main():
	'''
	while True:
		try:
			n=input()
			print(sum(list(map(int,filter(lambda x:int(x)%2==0,n)))))
			print()
		except:
			break
	'''
	for line in sys.stdin:
		print(sum(list(map(int,(filter(lambda x:int(x)%2==0,line[:-1] if line[-1]=='\n' else line))))))
		print()

if __name__ == '__main__':
	main()
