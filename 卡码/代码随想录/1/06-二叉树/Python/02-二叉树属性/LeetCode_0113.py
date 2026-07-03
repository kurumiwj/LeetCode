#113. 路径总和 II
from typing import *
from ..TreeNode import *

class Solution:
  def __init__(self):
    self.res=[]
    self.path=[]
  def traversal(self,root:Optional[TreeNode],targetSum:int):
    if not root:
      return
    self.path.append(root.val)
    #叶子节点且sum等于当前节点值说明找到路径
    if not root.left and not root.right and targetSum==root.val:
      self.res.append(list(self.path))
    self.traversal(root.left,targetSum-root.val)
    self.traversal(root.right,targetSum-root.val)
    self.path.pop()
  def pathSum(self, root: Optional[TreeNode], targetSum: int) -> List[List[int]]:
    self.traversal(root,targetSum)
    return self.res
