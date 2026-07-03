#111. 二叉树的最小深度
from typing import *
from ..TreeNode import *

class Solution:
  def minDepth(self, root: Optional[TreeNode]) -> int:
    if not root:
      return 0
    if root.left and not root.right:
      return 1+self.minDepth(root.left)
    if not root.left and root.right:
      return 1+self.minDepth(root.right)
    return 1+min(self.minDepth(root.left),self.minDepth(root.right))
