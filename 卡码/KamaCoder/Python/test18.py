#18. 链表的基本操作
import sys

class Node():
	def __init__(self,value):
		self.value=value
		self.length=0
		self.next=None
	def show(self):
		if self.length==0:
			print("Link list is empty",end="")
		else:
			tmp=self.next
			while tmp!=None:
				if tmp!=self.next:
					print(" ",end="")
				print(tmp.value,end="")
				tmp=tmp.next
	def insert(self,index,value):
		if index<1 or index>self.length+1:
			return False
		node=Node(value)
		if index==1:
			node.next=self.next
			self.next=node
		else:
			i=1
			tmp=self.next
			while tmp!=None:
				i+=1
				if i==index:
					break
				tmp=tmp.next
			node.next=tmp.next
			tmp.next=node
		self.length+=1
		return True
	def delete(self,index):
		if index<1 or index>self.length:
			return False
		tmp=self.next
		if index==1:
			self.next=tmp.next
		else:
			i=1
			while tmp!=None:
				i+=1
				if i==index:
					break
				tmp=tmp.next
			tmp.next=tmp.next.next
		self.length-=1
		return True
	def get(self,index):
		if index<1 or index>self.length:
			return None
		tmp=self.next
		i=1
		while tmp!=None:
			if i==index:
				return tmp
			i+=1
			tmp=tmp.next

def main():
	nums=list(map(int,input().split()))
	root=Node(-1)
	for i in range(1,nums[0]+1):
		root.insert(1,nums[i])
	n=int(input())
	for i in range(n):
		line=input().split()
		if line[0]=="show":
			root.show()
		elif line[0]=="delete":
			index=int(line[1])
			flag=root.delete(index)
			if flag:
				print("delete OK",end="")
			else:
				print("delete fail",end="")
		elif line[0]=="get":
			index=int(line[1])
			node=root.get(index)
			if node==None:
				print("get fail",end="")
			else:
				print(node.value,end="")
		else:
			index=int(line[1])
			value=int(line[2])
			flag=root.insert(index,value)
			if flag:
				print("insert OK",end="")
			else:
				print("insert fail",end="")
		print()

if __name__ == '__main__':
	main()
