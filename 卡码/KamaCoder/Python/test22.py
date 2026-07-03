#22. 二叉树的遍历
class Node:
	nodes=[-1]
	def __init__(self,data,left,right):
		self.data=data
		self.left=left
		self.right=right
	def preOrder(self):
		print(self.data,end="")
		if self.left!=0:
			Node.nodes[self.left].preOrder()
		if self.right!=0:
			Node.nodes[self.right].preOrder()
	def inOrder(self):
		if self.left!=0:
			Node.nodes[self.left].inOrder()
		print(self.data,end="")
		if self.right!=0:
			Node.nodes[self.right].inOrder()
	def postOrder(self):
		if self.left!=0:
			Node.nodes[self.left].postOrder()
		if self.right!=0:
			Node.nodes[self.right].postOrder()
		print(self.data,end="")

def main():
	n=int(input())
	for i in range(1,n+1):
		line=input().split()
		left,right=int(line[1]),int(line[2])
		Node.nodes.append(Node(line[0],left,right))
	Node.nodes[1].preOrder()
	print()
	Node.nodes[1].inOrder()
	print()
	Node.nodes[1].postOrder()

if __name__ == '__main__':
	main()
