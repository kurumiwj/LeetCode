#222. 完全二叉树的节点个数
from typing import *
from ..TreeNode import *

class Solution:
  def countNodes(self, root: Optional[TreeNode]) -> int:
    if not root:
      return 0
    left,right=root.left,root.right
    leftDepth,rightDepth=0,0
    while left:
      left=left.left
      leftDepth+=1
    while right:
      right=right.right
      rightDepth+=1
    if leftDepth==rightDepth:
      return (2<<leftDepth)-1
    return 1+self.countNodes(root.left)+self.countNodes(root.right)
