#7. 平均绩点
import sys

def main():
	scores="FDCBA"
	for line in sys.stdin:
		grades=line.split()
		total=0
		flag=False	#记录是否有奇怪的符号
		for grade in grades:
			index=scores.find(grade)
			if index==-1:
				flag=True
				break
			total+=index
		if flag:
			print("Unknown")
		else:
			print("{:.2f}".format(total/len(grades)))

if __name__ == '__main__':
	main()
