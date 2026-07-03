#4. A+B问题IV
import sys
from functools import reduce

def main():
	for line in sys.stdin:
		l=list(map(int,line.split()))
		if l[0]==0:
			break
		print(sum(l[1:]))

if __name__ == '__main__':
	main()
