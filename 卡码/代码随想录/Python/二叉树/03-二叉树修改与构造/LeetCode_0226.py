#226. 翻转二叉树
from typing import *
from ..TreeNode import *

class Solution:
  def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
    if not root:
      return root
    root.left,root.right=root.right,root.left
    self.invertTree(root.left)
    self.invertTree(root.right)
    return root
