#107. 二叉树的层序遍历 II
from typing import *
from ..TreeNode import *

class Solution:
  def levelOrderBottom(self, root: Optional[TreeNode]) -> List[List[int]]:
    res=[]
    queue=[]
    if root!=None:
      queue.append(root)
    while len(queue)>0:
      size=len(queue)
      v=[]
      while size>0:
        size-=1
        node=queue[0]
        queue=queue[1:]
        v.append(node.val)
        if node.left!=None:
          queue.append(node.left)
        if node.right!=None:
          queue.append(node.right)
      res.insert(0,v)
    return res
