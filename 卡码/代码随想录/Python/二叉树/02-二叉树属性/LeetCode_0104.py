#104. 二叉树的最大深度
from typing import *
from ..TreeNode import *

class Solution:
  def maxDepth(self, root: Optional[TreeNode]) -> int:
    if not root:
      return 0
    return 1+max(self.maxDepth(root.left),self.maxDepth(root.right))
