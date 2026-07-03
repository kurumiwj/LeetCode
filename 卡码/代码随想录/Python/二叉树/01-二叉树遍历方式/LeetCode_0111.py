#111. 二叉树的最小深度
from typing import *
from ..TreeNode import *

class Solution:
  def minDepth(self, root: Optional[TreeNode]) -> int:
    depth:int=0
    q:List[TreeNode]=[]
    if root!=None:
      q.append(root)
    while len(q)>0:
      size:int=len(q)
      depth+=1
      for i in range(size):
        node:TreeNode=q[0]
        q=q[1:]
        if node.left:
          q.append(node.left)
        if node.right:
          q.append(node.right)
        if not node.left and not node.right:
          return depth
    return depth
