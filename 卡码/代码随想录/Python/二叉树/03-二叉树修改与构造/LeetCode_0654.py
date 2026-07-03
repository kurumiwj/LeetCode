#654. 最大二叉树
from typing import *
from ..TreeNode import *

class Solution:
  def traversal(self,nums:List[int],left:int,right:int)->Optional[TreeNode]:
    if left>=right:
      return None
    maxIndex:int=left
    for i in range(left,right):
      if nums[i]>nums[maxIndex]:
        maxIndex=i
    root:TreeNode=TreeNode(nums[maxIndex])
    root.left=self.traversal(nums,left,maxIndex)
    root.right=self.traversal(nums,maxIndex+1,right)
    return root
  def constructMaximumBinaryTree(self, nums: List[int]) -> Optional[TreeNode]:
    return self.traversal(nums,0,len(nums))
