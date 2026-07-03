#538. 把二叉搜索树转换为累加树
from typing import *
from ..TreeNode import *

class Solution:
  def __init__(self):
    self.pre:int=0
  def traversal(self,root:Optional[TreeNode]):
    if not root:
      return None
    self.traversal(root.right)
    root.val+=self.pre
    self.pre=root.val
    self.traversal(root.left)
  def convertBST(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
    self.pre=0
    self.traversal(root)
    return root
