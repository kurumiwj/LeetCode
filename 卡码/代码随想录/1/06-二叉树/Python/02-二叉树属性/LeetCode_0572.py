#572. 另一棵树的子树
from typing import *
from ..TreeNode import *

class Solution:
  def compare(self,left:Optional[TreeNode],right:Optional[TreeNode])->bool:
    if left!=None and right==None or left==None and right!=None:
      return False
    elif left==None and right==None:
      return True
    elif left.val!=right.val:
      return False
    else:
      return self.compare(left.left,right.left) and self.compare(left.right,right.right)

  def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
    if not root:
      return False
    return self.compare(root,subRoot) or self.isSubtree(root.left,subRoot) or self.isSubtree(root.right,subRoot)
