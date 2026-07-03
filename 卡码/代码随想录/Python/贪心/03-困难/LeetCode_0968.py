#968. 监控二叉树
from typing import *
from ..TreeNode import *

'''
0:无覆盖
1:有摄像头
2:有覆盖
'''
class Solution:
  def __init__(self):
    self.res:int=0
  def traversal(self,root:Optional[TreeNode])->int:
    if root==None:
      return 2
    left:int=self.traversal(root.left)
    right:int=self.traversal(root.right)
    if left==2 and right==2:
      return 0
    elif left==0 or right==0:
      self.res+=1
      return 1
    elif left==1 or right==1:
      return 2
  def minCameraCover(self, root: Optional[TreeNode]) -> int:
    if self.traversal(root)==0:
      self.res+=1
    return self.res