#23. 二叉树的高度
import sys

class Node:
	def __init__(self,data):
		self.data=data
		self.left=None
		self.right=None
	def getHeight(self):
		leftHeight,rightHeight=0,0
		if self.left!=None:
			leftHeight=self.left.getHeight()
		if self.right!=None:
			rightHeight=self.right.getHeight()
		return max(leftHeight,rightHeight)+1
	@staticmethod
	def createTree(preOrder,inOrder,preLeft,preRight,inLeft,inRight):
		if preLeft>preRight or inLeft>inRight:
			return None
		rootIndex=inOrder.find(preOrder[preLeft])
		root=Node(preOrder[preLeft])
		leftNum=rootIndex-inLeft
		root.left=Node.createTree(preOrder,inOrder,preLeft+1,preLeft+leftNum,inLeft,rootIndex-1)
		root.right=Node.createTree(preOrder,inOrder,preLeft+1+leftNum,preRight,rootIndex+1,inRight)
		return root

def main():
	for line in sys.stdin:
		n=int(line)
		preOrder=input()
		inOrder=input()
		root=Node.createTree(preOrder,inOrder,0,n-1,0,n-1)
		print(root.getHeight())

if __name__ == '__main__':
  main()
