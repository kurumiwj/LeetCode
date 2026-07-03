#102. 二叉树的层序遍历
from typing import *
from ..TreeNode import *

class Solution:
  def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
		res:List[List[int]]=[]
		q:List[TreeNode]=[]
		if root!=None:
			q.append(root)
		while len(q)!=0:
			size:int=len(q)
			v:List[int]=[]
			while size>0:
				size-=1
				node:TreeNode=q.pop(0)
				v.append(node.val)
				if node.left:
					q.append(node.left)
				if node.right:
					q.append(node.right)
			res.append(v)
		return res
