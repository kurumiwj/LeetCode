#144-145-94.二叉树的前/后/中序遍历
from typing import *
from ..TreeNode import *

class Solution:
	#先序遍历
  def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
		res:List[int]=[]
		self.preOrder(root,res)
		return res
	def preOrder(self,root:Optional[TreeNode],res:List[int]):
		if root==None:
			return
		res.append(root.val)
		self.preOrder(root.left,res)
		self.preOrder(root.right,res)
	#中序遍历
	def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
		res:List[int]=[]
		self.inOrder(root,res)
		return res
	def inOrder(self,root:Optional[TreeNode],res:List[int]):
		if root==None:
			return
		self.inOrder(root.left,res)
		res.append(root.val)
		self.inOrder(root.right,res)
	#后序遍历
	def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
		res:List[int]=[]
		self.postOrder(root,res)
		return res
	def postOrder(self,root:Optional[TreeNode],res:List[int]):
		if root==None:
			return
		self.postOrder(root.left,res)
		self.postOrder(root.right,res)
		res.append(root.val)
