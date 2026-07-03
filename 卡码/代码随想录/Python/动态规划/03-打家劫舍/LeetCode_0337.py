#337. 打家劫舍 III
from typing import *

class TreeNode:
  def __init__(self, val=0, left=None, right=None):
    self.val = val
    self.left = left
    self.right = right

class Solution:
  def traversal(self,root:Optional[TreeNode])->List[int]:
    if not root:
      return [0,0]
    left:List[int]=self.traversal(root.left)
    right:List[int]=self.traversal(root.right)
    #不偷
    v0:int=max(left[0],left[1])+max(right[0],right[1])
    #偷
    v1:int=left[0]+right[0]+root.val
    return [v0,v1]
  def rob(self, root: Optional[TreeNode]) -> int:
    res:List[int]=self.traversal(root)
    return max(res[0],res[1])