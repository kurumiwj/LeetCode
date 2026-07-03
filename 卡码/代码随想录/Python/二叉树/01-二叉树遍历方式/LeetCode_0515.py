#515. 在每个树行中找最大值
from typing import *
from ..TreeNode import *

class Solution:
  def largestValues(self, root: Optional[TreeNode]) -> List[int]:
    res:List[int]=[]
    q:List[TreeNode]=[]
    if root!=None:
      q.append(root)
    while len(q)>0:
      size:int=len(q)
      maxVal:int=q[0].val
      for i in range(size):
        node:TreeNode=q[0]
        q=q[1:]
        maxVal=node.val if node.val>maxVal else maxVal
        if node.left!=None:
          q.append(node.left)
        if node.right!=None:
          q.append(node.right)
      res.append(maxVal)
    return res
