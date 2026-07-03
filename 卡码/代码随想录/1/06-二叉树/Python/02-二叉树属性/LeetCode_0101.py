#101. 对称二叉树
from typing import *
from ..TreeNode import *

class Solution:
  def compare(self,left:Optional[TreeNode],right:Optional[TreeNode])->bool:
    if left!=None and right==None:
      return False
    elif left==None and right!=None:
      return False
    elif left==None and right==None:
      return True
    elif left.val!=right.val:
      return False
    else:
      return self.compare(left.left,right.right) and self.compare(left.right,right.left)

  def isSymmetric(self, root: Optional[TreeNode]) -> bool:
    if not root:
      return False
    return self.compare(root.left,root.right)
