#501. 二叉搜索树中的众数
from typing import *
from ..TreeNode import *

class Solution:
  def __init__(self):
    self.pre:TreeNode=None
    self.res:List[int]=[]
    self.count:int=0
    self.maxCount:int=0
  def traversal(self,root:Optional[TreeNode]):
    if not root:
      return
    self.traversal(root.left)
    if not self.pre or self.pre.val!=root.val:
      self.count=1
    else:
      self.count+=1
    self.pre=root
    if self.count==self.maxCount:
      self.res.append(root.val)
    elif self.count>self.maxCount:
      self.maxCount=self.count
      self.res=[root.val]
    self.traversal(root.right)
    return
  def findMode(self, root: Optional[TreeNode]) -> List[int]:
    self.traversal(root)
    return self.res
