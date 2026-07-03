#110. 平衡二叉树
from typing import *
from ..TreeNode import *

class Solution:
  def getHeight(self,root:Optional[TreeNode])->int:
    if not root:
      return 0
    leftHeight:int=self.getHeight(root.left)
    rightHeight:int=self.getHeight(root.right)
    if leftHeight==-1 or rightHeight==-1:
      return -1
    return -1 if abs(leftHeight-rightHeight)>1 else 1+max(leftHeight,rightHeight)

  def isBalanced(self, root: Optional[TreeNode]) -> bool:
    return True if self.getHeight(root)!=-1 else False
