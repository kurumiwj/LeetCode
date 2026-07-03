#98. 验证二叉搜索树
from typing import *
from ..TreeNode import *

class Solution:
  def __init__(self):
    self.pre:TreeNode=None
  def isValidBST(self, root: Optional[TreeNode]) -> bool:
    if not root:
      return True
    left:bool=self.isValidBST(root.left)
    if self.pre and self.pre.val>=root.val:
      return False
    self.pre=root
    right:bool=self.isValidBST(root.right)
    return left and right
