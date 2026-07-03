#637. 二叉树的层平均值
from typing import *
from ..TreeNode import *

class Solution:
  def averageOfLevels(self, root: Optional[TreeNode]) -> List[float]:
    res=[]
    q=[]
    if root!=None:
      q.append(root)
    while len(q)>0:
      size=len(q)
      total=0
      for i in range(size):
        node=q[0]
        q=q[1:]
        total+=node.val
        if node.left!=None:
          q.append(node.left)
        if node.right!=None:
          q.append(node.right)
      res.append(total/size)
    return res
