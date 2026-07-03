#404. 左叶子之和
from typing import *
from ..TreeNode import *

class Solution:
  def sumOfLeftLeaves(self, root: Optional[TreeNode]) -> int:
    if not root:
      return 0
    leftSum:int=0
    if root.left and not root.left.left and not root.left.right:
      leftSum=root.left.val
    return leftSum+self.sumOfLeftLeaves(root.left)+self.sumOfLeftLeaves(root.right)
