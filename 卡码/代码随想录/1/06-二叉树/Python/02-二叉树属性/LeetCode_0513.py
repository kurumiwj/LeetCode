#513. 找树左下角的值
from typing import *
from ..TreeNode import *

class Solution:
  def __init__(self):
    self.maxDepth:int=-1
    self.res:int=0
  def traversal(self,root:Optional[TreeNode],depth:int):
    if not root.left and not root.right:
      if depth>self.maxDepth:
        self.maxDepth=depth
        self.res=root.val
      return
    root.left and self.traversal(root.left,depth+1)
    root.right and self.traversal(root.right,depth+1)

  def findBottomLeftValue(self, root: Optional[TreeNode]) -> int:
    self.traversal(root,0)
    return self.res
#   def findBottomLeftValue(self, root: Optional[TreeNode]) -> int:
#     q:List[TreeNode]=[]
#     if root:
#       q.append(root)
#     res:int=0
#     while len(q)>0:
#       size:int=len(q)
#       for i in range(size):
#         node:TreeNode=q[0]
#         q=q[1:]
#         if i==0:
#           res=node.val
#         if node.left:
#           q.append(node.left)
#         if node.right:
#           q.append(node.right)
#     return res
