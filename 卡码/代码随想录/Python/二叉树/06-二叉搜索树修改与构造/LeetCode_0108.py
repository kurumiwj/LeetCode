#108. 将有序数组转换为二叉搜索树
from typing import *
from ..TreeNode import *

class Solution:
  def traversal(self,nums:List[int],left:int,right:int)->Optional[TreeNode]:
    if left>right:
      return None
    mid:int=(left+right)//2
    root:TreeNode=TreeNode(nums[mid])
    root.left=self.traversal(nums,left,mid-1)
    root.right=self.traversal(nums,mid+1,right)
    return root
  def sortedArrayToBST(self, nums: List[int]) -> Optional[TreeNode]:
    return self.traversal(nums,0,len(nums)-1)
