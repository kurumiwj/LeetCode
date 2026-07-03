#112. 路径总和
from typing import *
from ..TreeNode import *

class Solution:
  def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
    if not root:
      return False
    #如果当前节点是叶子节点且目标和与叶子节点值相等则找到路径
    if not root.left and not root.right and targetSum==root.val:
      return True
    return self.hasPathSum(root.left,targetSum-root.val) or self.hasPathSum(root.right,targetSum-root.val)
