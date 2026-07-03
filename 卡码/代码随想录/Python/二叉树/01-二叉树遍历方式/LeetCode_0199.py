#199. 二叉树的右视
from typing import *
from ..TreeNode import *

class Solution:
  def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
    res=[]
    q=[]
    if root!=None:
      q.append(root)
    while len(q)>0:
      size=len(q)
      for i in range(size):
        node=q[0]
        q=q[1:]
        if i==size-1:
          res.append(node.val)
        if node.left!=None:
          q.append(node.left)
        if node.right!=None:
          q.append(node.right)
    return res
