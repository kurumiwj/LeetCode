#21. 构造二叉树
import sys

class Node:
	def __init__(self,data):
		self.data=data
		self.left=None
		self.right=None
	def postOrder(self):
		if self.left!=None:
			self.left.postOrder()
		if self.right!=None:
			self.right.postOrder()
		print(self.data,end="")

def createBTree(preOrder,inOrder,preLeft,preRight,inLeft,inRight):
	if preLeft>preRight or inLeft>inRight:
		return None
	rootIndex=inOrder.find(preOrder[preLeft])
	root=Node(preOrder[preLeft])
	leftNum=rootIndex-inLeft
	rightNum=inRight-rootIndex
	root.left=createBTree(preOrder,inOrder,preLeft+1,preLeft+leftNum,inLeft,rootIndex-1)
	root.right=createBTree(preOrder,inOrder,preLeft+1+leftNum,preRight,rootIndex+1,inRight)
	return root

def main():
	for line in sys.stdin:
		preOrder,inOrder=line.split()
		root=createBTree(preOrder,inOrder,0,len(preOrder)-1,0,len(inOrder)-1)
		root.postOrder()
		print()

if __name__ == '__main__':
	main()
