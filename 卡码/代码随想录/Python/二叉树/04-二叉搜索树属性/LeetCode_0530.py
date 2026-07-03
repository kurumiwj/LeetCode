#530. 二叉搜索树的最小绝对差
import sys
from typing import *
from ..TreeNode import *

class Solution:
  def __init__(self):
    self.res:int=sys.maxsize
    self.pre:TreeNode=None
  def traversal(self,root:Optional[TreeNode]):
    if not root:
      return
    self.traversal(root.left)
    if self.pre:
      self.res=min(self.res,root.val-self.pre.val)
    self.pre=root
    self.traversal(root.right)
  def getMinimumDifference(self, root: Optional[TreeNode]) -> int:
    self.traversal(root)
    return self.res
